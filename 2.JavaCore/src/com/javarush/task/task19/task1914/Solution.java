package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String sss = byteArrayOutputStream.toString();
        int a, b, c;
        String[] strArr = sss.split(" [-|+|*|=] ");
        a = Integer.parseInt(strArr[0]);
        b = Integer.parseInt(strArr[1]);
        c = 0;
        char ch = sss.split(" ")[1].charAt(0);
        if (ch == '+') c = a + b;
        if (ch == '*') c = a * b;
        if (ch == '-') c = a - b;
        String result = sss + String.valueOf(c);
        System.setOut(consoleStream);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.print("3 + 6 = ");
        }
    }
}

