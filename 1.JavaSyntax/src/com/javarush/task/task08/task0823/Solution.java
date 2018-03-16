package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] arr = s.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (String n : arr
             ) {
            if (!n.equals("")) list.add(n);
        }
        for (String n : list
                ) {
            String k = n.substring(0, 1).toUpperCase();
            n = k + n.substring(1);
            System.out.print(n + " ");
        }
        //напишите тут ваш код
    }
}
