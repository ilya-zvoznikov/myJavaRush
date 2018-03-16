package com.javarush.task.task05.task0529;

import javafx.scene.web.WebHistory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {
            String a1 = reader.readLine();
            if (!a1.equals("сумма")) {
                int a = Integer.parseInt(a1);
                sum = sum + a;
            }
            else {
                System.out.println(sum);
                break;
            }
        }

    }
}
