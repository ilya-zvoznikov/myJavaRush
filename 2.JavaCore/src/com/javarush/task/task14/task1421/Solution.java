package com.javarush.task.task14.task1421;

/* 
Singleton
*/
public class Solution {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        System.out.println(a);
        Singleton b = Singleton.getInstance();
        System.out.println(b);
    }
}
