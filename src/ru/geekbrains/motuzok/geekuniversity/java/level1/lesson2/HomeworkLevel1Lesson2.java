package ru.geekbrains.motuzok.geekuniversity.java.level1.lesson2;

public class HomeworkLevel1Lesson2 {

    public static void main(String[] args) {
        System.out.println(checkNumber(1, 2));
        checkNegative(-2);
        System.out.println(checkNegativeBoolean(1));
        printString("привет", 2);
        System.out.println(leapYear(1956));

    }

    public static boolean checkNumber(int a, int b) {
        int result = a + b;
        return result >= 10 && result <= 20;
    }

    public static void checkNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkNegativeBoolean(int a) {
        return a <= 0;
    }

    public static void printString(String string, int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(string);
        }
    }

    public static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}
