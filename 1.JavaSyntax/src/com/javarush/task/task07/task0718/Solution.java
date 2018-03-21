package com.javarush.task.task07.task0718;

import org.omg.CORBA.INTERNAL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < 9; i++) {
            String s = list.get(i);
            String s1 = list.get(i + 1);
            Integer l = s.length();
            Integer l1 = s1.length();
            if (l1 <= l) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}

