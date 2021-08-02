package school.lesson2;

import java.util.Arrays;

public class HomeWork {


    public static boolean within10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void isPositiveOrNegative(int c) {
        if (c >= 0) {
            System.out.println( "The number is positive");
        } else {
            System.out.println( "The number is negative");
        }
    }

    public static boolean isNegative(int d) {
        return d >= 0;
    }

    public static void printWordNTimes(String s, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

    public static boolean isYearLeap(int a) {
        if (a % 4 == 0) {
            return a % 100 != 0 || a % 400 == 0;
        }
        return false;
    }

    public static int[] fillingArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;

        }
        return array;


    }


    public static void main(String[] args) {
        System.out.println(within10and20(0, 14));//1
        System.out.println("=============================================================");
        isPositiveOrNegative(-9);//2
        System.out.println("=============================================================");
        System.out.println(isNegative(9));//3
        System.out.println("=============================================================");
        printWordNTimes("privet", 4);//4
        System.out.println("=============================================================");

        System.out.println(isYearLeap(1000));//*
        System.out.println(isYearLeap(2020));//*
        System.out.println(isYearLeap(2021));//*
        System.out.println(isYearLeap(1200));//*
        System.out.println("=============================================================");

        int[] array6 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] == 1) {
                array6[i] = 0;
            } else {
                array6[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array6));//6
        System.out.println("=============================================================");


        int[] array7 = new int[100];
        for (int i = 0; i < array7.length; i++) {
            array7[i] = i + 1;
        }
        System.out.println(Arrays.toString(array7));//7
        System.out.println("=============================================================");


        int[] array8 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array8.length; i++) {
            if (array8[i] < 6) {
                array8[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array8));//8
        System.out.println("=============================================================");

        int[][] array9 = new int[3][3];
        for (int i = 0; i < array9.length; i++) {
            for (int j = 0; j < array9[i].length; j++) {
                if (i == j) {
                    array9[i][j] = 1;
                }
            }
        }
        for (int[] innerArray : array9) {
            System.out.println(Arrays.toString(innerArray));//9
        }
        System.out.println("=============================================================");

        System.out.println(Arrays.toString(fillingArray(6, 2)));
        System.out.println("=============================================================");

        int[] array11 = {1, 2, 3, 4, 5};
        int max = array11[0];
        int min = array11[0];
        for (int i = 1; i < array11.length; i++) {
            if (array11[i] > max) {
                max = array11[i];
            } else {
                min = array11[i];
            }
        }
        System.out.println( "max = "+ max + " min = " + min);



    }
}


