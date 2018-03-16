package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        int l = n1.length();
        long n = Long.parseLong(n1);
        long s;

        for (int i = 1; i <= l; i++) {
            s = n%10;
            if (s%2 == 0)
                even++;
            else
                odd++;
            n = (n - s) / 10;
//        System.out.println("n = " + n);
//        System.out.println("s = " + s);
//        System.out.println("even = " + even);
//        System.out.println("odd = " + odd);
        }
        System.out.println("Четные: " + even + " Нечетные: " + odd);

    }
}
