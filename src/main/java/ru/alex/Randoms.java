package ru.alex;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private int lowLimit;
    private int highLimit;
    private Random random;

    public Randoms(int low, int high){
        this.lowLimit = low;
        this.highLimit = high;
        this.random = new Random();
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(highLimit - lowLimit + 1) + lowLimit;
            }
        };
    }
}
