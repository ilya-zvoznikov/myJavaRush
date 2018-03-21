package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);
        String b1 = reader.readLine();
        int b = Integer.parseInt(b1);
        String c1 = reader.readLine();
        int c = Integer.parseInt(c1);

        if (srav(a, b, c) == false)
        {
            if (srav(a, b) == true)
                System.out.println("3");
            else {
                if (srav(a, c) == true)
                    System.out.println("2");
                else
                {
                    if (srav(c, b) == true)
                        System.out.println("1");
                }
            }
        }


    }
    public static boolean srav(int l, int n, int m) {
        boolean sr;
        if ((l == n) && (n == m))
            sr = true;
        else
            sr = false;
        return sr;

    }
    public static boolean srav(int l, int n) {
        boolean sr;
        if (l == n)
            sr = true;
        else
            sr = false;
        return sr;

    }
}
