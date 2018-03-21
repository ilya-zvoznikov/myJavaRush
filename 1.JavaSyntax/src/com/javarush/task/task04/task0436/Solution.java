package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String m1 = reader.readLine();
        String n1 = reader.readLine();
        int m = Integer.parseInt(m1);
        int n = Integer.parseInt(n1);

        for (int j = 1; j <= m; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print("8");
            }
            System.out.print("\n");
        }
    }
}
