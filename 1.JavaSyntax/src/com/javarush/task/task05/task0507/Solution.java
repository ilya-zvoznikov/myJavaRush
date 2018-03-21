package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double i = 0, sum = 0;
        double sred = 0;

        while (true) {
            String a1 = reader.readLine();
            if (!a1.equals("-1")) {
                int a = Integer.parseInt(a1);
                sum = sum + a;
                i++;
            } else {
                sred = sum / i;
                System.out.println(sred);
                break;
            }
        }
    }
}

