package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
//        String s = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";
        s = s.substring(s.indexOf("?") + 1);
        String[] par = s.split("&");
        String obj = "";

        for (int i = 0; i < par.length; i++) {
            if (par[i].contains("obj")) obj = par[i].substring(par[i].indexOf("=") + 1);
            if (par[i].contains("=")) par[i] = par[i].substring(0, par[i].indexOf("="));
            System.out.print(par[i] + " ");
        }
        System.out.print("\n");
        if (obj != "") {
            try {
                alert(Double.parseDouble(obj));
            } catch (Exception e) {
                alert(obj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
