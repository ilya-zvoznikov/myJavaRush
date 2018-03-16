package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.nio.Buffer;

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

        int s1 = 0, s2 = 0, s3 = 0;

        if (max(a, b, c) == true) {
            s1 = a;
            if (max(b, c) == true) {
                s2 = b;
                s3 = c;
            }
            else {
                s2 = c;
                s3 = b;
            }
        }
        if (max(b, a, c) == true) {
            s1 = b;
            if (max(a, c) == true) {
                s2 = a;
                s3 = c;
            }
            else {
                s2 = c;
                s3 = a;
            }
        }
        if (max(c, b, a) == true) {
            s1 = c;
            if (max(a, b) == true) {
                s2 = a;
                s3 = b;
            }
            else {
                s2 = b;
                s3 = a;
            }
        }



        System.out.println(s1 + " " + s2 + " " + s3);
        }


    public static boolean max(int n, int m, int l) {
        boolean max;
        if ((n >= m) && (n >= l))
            max = true;
        else
            max = false;

        return max;
    }
    public static boolean max(int n, int m) {
        boolean max;
        if (n >= m)
            max = true;
        else
            max = false;

        return max;
    }


}
