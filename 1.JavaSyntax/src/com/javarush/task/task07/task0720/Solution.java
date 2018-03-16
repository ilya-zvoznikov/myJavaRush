package com.javarush.task.task07.task0720;

import org.omg.CORBA.INTERNAL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < M; i++) {
            String s = list.get(0);
            list.remove(0);
            list.add(s);
        }

        for (String a : list
             ) {
            System.out.println(a);
        }

        //напишите тут ваш код
    }
}
