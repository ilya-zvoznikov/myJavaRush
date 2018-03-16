package com.javarush.task.task03.task0309;

/* 
Сумма 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 1, s = 0;
        while (i < 11) {
            s = s + i;
            i = i + 1;
            System.out.println(s);
        }

    }
}
