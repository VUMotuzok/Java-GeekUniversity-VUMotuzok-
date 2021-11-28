package ru.geekbrains.motuzok.geekuniversity.java.level1;

    public class HomeWorkApp {

        public static void main(String[] args) {
            compareNumber();

        }

        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        public static int checkSumSign(int a, int b) {
            int result = a + b;
            if (result >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
            return result;
        }

        public static void printColor() {
            int value = -5;
            if (value <= 0) {
                System.out.println("Красный");
            } else if (0 < value && value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }

        public static void compareNumber() {
            int a = 2;
            int b = -2;
            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
        }
    }




