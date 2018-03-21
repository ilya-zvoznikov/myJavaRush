package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        if (srav(a, b, c) == true)
            System.out.println(a + " " + b + " " + c);
        else {
            if (srav(a, b) == true)
                System.out.println(a + " " + b);
            if (srav(b, c) == true)
                System.out.println(b + " " + c);
            if (srav(a, c) == true)
                System.out.println(a + " " + c);
        }

    }
    public static boolean srav(int n, int m) {
        boolean s;
        if (n == m)
            s = true;
        else
            s = false;
        return s;
    }
    public static boolean srav(int n, int m, int l) {
        boolean s;
        if ((n == m) && (m == l))
            s = true;
        else
            s = false;
        return s;
    }
}