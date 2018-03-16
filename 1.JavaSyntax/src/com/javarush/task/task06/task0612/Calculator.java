package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return (a + b);
        // return 0;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return (a - b);
        // return 0;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return (a * b);
        // return 0;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double a1 = a;
        double b1 = b;
        double s = a1 / b1;
        return s;
        // return 0;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double s = a * b / 100;
        return s;
        // return 0;
    }

    public static void main(String[] args) {

    }
}