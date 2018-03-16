package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put(3.0, "sdfsdf");
        labels.put(4.8, "34");
        labels.put(5.7, "sdf");
        labels.put(5.3, "sdfx");
        labels.put(9.3, "ghj");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
