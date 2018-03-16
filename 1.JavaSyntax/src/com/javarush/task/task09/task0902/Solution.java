package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        //System.out.println(element[2].getMethodName());
        return element[2].getMethodName();
        //System.out.println();
        //return element1;
        //return null;

    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        //System.out.println(element[2].getMethodName());
        return element[2].getMethodName();
        //String element2 = Thread.currentThread().getName();
        //return element2;
        //return null;
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        //System.out.println(element[2].getMethodName());
        return element[2].getMethodName();

        //String element3 = Thread.currentThread().getName();
        //return element3;
        //return null;
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        //System.out.println(element[2].getMethodName());
        return element[2].getMethodName();
        //String element4 = Thread.currentThread().getName();
        //return element4;
        //return null;
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        //System.out.println(element[2].getMethodName());
        return element[2].getMethodName();
        //String element5 = Thread.currentThread().getName();
        //return element5;
        //return null;
    }
}
