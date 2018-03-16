package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        /*return напишите тут ваш код 0*/;
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        //System.out.println(elements[2].getLineNumber());
        return elements[2].getLineNumber();
    }

    public static int method2() {
        method3();
        /*return напишите тут ваш код 0*/;
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        //System.out.println(elements[2].getLineNumber());
        return elements[2].getLineNumber();
    }

    public static int method3() {
        method4();
        /*return напишите тут ваш код 0*/;
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        //System.out.println(elements[2].getLineNumber());
        return elements[2].getLineNumber();
    }

    public static int method4() {
        method5();
        /*return напишите тут ваш код 0*/;
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        //System.out.println(elements[2].getLineNumber());
        return elements[2].getLineNumber();
    }

    public static int method5() {
        /*return напишите тут ваш код 0*/;
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        //System.out.println(elements[2].getLineNumber());
        return elements[2].getLineNumber();
    }
}
