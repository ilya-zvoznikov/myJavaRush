package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        int a = Integer.parseInt(reader.readLine());
        int maximum = a;

        for (int i = 2; i <= n; i++) {
            a = Integer.parseInt(reader.readLine());
            maximum = maximum > a ? maximum : a;

        }

        System.out.println(maximum);
    }
}
