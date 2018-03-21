package com.javarush.task.task08.task0812;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> schet = new ArrayList<>();
        Integer n = 0;
        for (int i = 0; i < 10; i++) { list.add(Integer.parseInt(reader.readLine())); }
        for (int i = 0; i < 9; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                n++;
            }
            else {
                schet.add(0, n + 1);
                n = 0;
            }
            //System.out.print(n + " ");
        }
        schet.add(0, n + 1);
        /*for (Integer s : schet
             ) {
            System.out.print(s + " ");
        }*/
        Integer max = 0;
        for (int i = 0; i < schet.size(); i++) {
            if (schet.get(i) > max)
                max = schet.get(i);
        }
        System.out.println(max);

    }
}