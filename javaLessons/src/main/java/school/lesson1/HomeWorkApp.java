package school.lesson1;

import jdk.swing.interop.SwingInterOpUtils;

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");

    }

    public static void checkSumSign() {
        int a = 59;
        int b = 5;

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 168;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 4;
        int b = 2;
        if (a >= b){
            System.out.println("a>=b");
        }else{
            System.out.println("a<b");
        }
    }

}
