package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);

        if (a == 0)
            System.out.println("ноль");
        else {
            if (polozh(a)) {
                if (chet(a))
                    System.out.printf("положительное четное число");
                else
                    System.out.println("положительное нечетное число");
            }
            else {
                if (chet(a))
                    System.out.printf("отрицательное четное число");
                else
                    System.out.println("отрицательное нечетное число");

            }

        }

    }
    public static boolean polozh(int n){
        return (n > 0);
    }
    public static boolean chet(int n){
        return (n%2 == 0);
    }
}
