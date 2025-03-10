package ru.alex;

public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(80, 155)) {
            System.out.println("Случайное число: " + r);
            if (r == 155) {
                System.out.println("Выпало число 155, давайте на этом закончим");
                break;
            }
        }
    }
}