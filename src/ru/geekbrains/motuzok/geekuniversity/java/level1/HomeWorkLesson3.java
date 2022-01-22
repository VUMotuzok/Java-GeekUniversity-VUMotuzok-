package ru.geekbrains.motuzok.geekuniversity.java.level1;

import java.util.Arrays;

public class HomeWorkLesson3 {

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array(arr1)));

        int[] arr2 = new int[100];
        System.out.println(Arrays.toString(array2(arr2)));

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array3(arr3)));

        printArray4();

        System.out.println(Arrays.toString(arr5(15, 8)));

        int[] arr6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        array6(arr6);

        int[] arr7 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(checkBalance(arr7));

        int[] arr8 = {1, 2, 3, 4, 5, 6, 7, 8};
        shiftElements(arr8, 3);
        System.out.println(Arrays.toString(arr8));
    }

    public static int[] array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }

        }
        return arr;
    }

    public static int[] array2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static int[] array3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    public static void printArray4() {
        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }

        for (int[] element : arr) {
            System.out.print(Arrays.toString(element) + "\n");
        }
        System.out.println();
    }

    public static int[] arr5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void array6(int[] arr) {

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("максимальное значение массива " + max + ", минимальное " + min);
    }

    public static boolean checkBalance(int[] array) {
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++) {
                rightSum += (j > i) ? array[j] : 0;
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    public static void shiftElements(int[] array, int n) {
        int length = array.length;
        n = n % length;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int elementShift = array[length - 1];
                for (int j = length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = elementShift;
            }
        }
        if (n < 0) {
            for (int i = length; i > n; i--) {
                int elementShift = array[length - 1];
                for (int j = length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = elementShift;
            }
        }
    }
}