package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.print(sol.intVar + " ");
        System.out.print(sol.doubleVar + " ");
        System.out.print(sol.DoubleVar + " ");
        System.out.print(sol.booleanVar + " ");
        System.out.print(sol.ObjectVar + " ");
        System.out.print(sol.ExceptionVar + " ");
        System.out.print(sol.StringVar);
    }
}
