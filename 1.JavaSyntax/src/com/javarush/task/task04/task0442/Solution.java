package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String a1 = reader.readLine();
            int a = Integer.parseInt(a1);
            sum = sum + a;
            if (a1.equals("-1")) {
                break;
            }
        }

        System.out.println(sum);
    }
}
