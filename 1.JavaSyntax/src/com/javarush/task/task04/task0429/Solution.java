package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int pol = 0, otr = 0;
        for (int i = 1; i <= 3; i++) {
            String a1 = reader.readLine();
            int a = Integer.parseInt(a1);
            if (a > 0)
                pol++;
            else {
                if (a < 0)
                    otr++;
            }

        }
        System.out.println("количество отрицательных чисел: " + otr);
        System.out.println("количество положительных чисел: " + pol);

    }
}
