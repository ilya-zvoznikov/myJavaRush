package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) throws Exception{
        try {
            divisionByZero();
        }
        catch (Exception e) {
            System.out.println("AAAAAAA!!!!!");
            e.printStackTrace();
        }
    }

    public static void divisionByZero () throws Exception{
        //try {
            int b = 5/0;
            System.out.println(b);
        //}
        //catch (Exception e) {
        //    throw e;
        //}
    }
}
