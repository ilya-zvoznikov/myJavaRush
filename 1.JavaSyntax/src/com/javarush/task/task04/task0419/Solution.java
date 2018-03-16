package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        String d1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        int d = Integer.parseInt(d1);

        System.out.println(srav(srav(a, b), srav(c, d)));


    }
    public static int srav(int n, int m) {
        int s;
        if (n > m)
            s = n;
        else
            s = m;
        return s;
    }
}
