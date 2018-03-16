package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int b;
        int nod = 1;
        String as, bs;
        as = reader.readLine();
        bs = reader.readLine();
        try {
            a = Integer.parseInt(as);
            b = Integer.parseInt(bs);
            if ((a <= 0) || (b <= 0)) throw new Exception();
                for (int i = 1; i <= a; i++) {
                    if ((a % i == 0) && (b % i == 0)) nod = i;
                }
            System.out.println(nod);
        } catch (Exception e) {
            throw new Exception();
            //System.out.println("Очень плохо");
        }
    }
}
