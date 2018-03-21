package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int c = Integer.parseInt(n3);

        if ((srav(a, (b + c)) == true) && (srav(b, (a + c)) == true) && (srav(c, (b + a)) == true))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");


    }
    public static boolean srav(int n, int m) {
        boolean s;
        if (n < m)
            s = true;
        else
            s = false;
        return s;
    }
}