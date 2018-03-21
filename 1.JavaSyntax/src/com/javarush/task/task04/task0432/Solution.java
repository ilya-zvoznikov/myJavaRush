package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String n1 = reader.readLine();
        int n = Integer.parseInt(n1);
        while (n > 0) {
            System.out.println(s);
            n--;
        }

    }
}
