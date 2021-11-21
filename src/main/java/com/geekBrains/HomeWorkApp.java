package com.geekBrains;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor(100);
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 20;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = 15;
        int b = 22;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }
}
