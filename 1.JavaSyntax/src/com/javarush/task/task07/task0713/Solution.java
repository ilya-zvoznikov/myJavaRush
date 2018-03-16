package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> delna3 = new ArrayList<Integer>();
        ArrayList<Integer> delna2 = new ArrayList<Integer>();
        ArrayList<Integer> proch = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            Integer n = Integer.parseInt(reader.readLine());
            list.add(n);
            if (n % 3 == 0) delna3.add(n);
            if (n % 2 == 0) delna2.add(n);
            if ((n % 3 != 0) && (n % 2 != 0)) proch.add(n);
        }
        printList(delna3);
        printList(delna2);
        printList(proch);


    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
