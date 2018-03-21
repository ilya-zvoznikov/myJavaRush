package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) { //метод main
        //напишите тут ваш код
        System.out.println(convertEurToUsd(100, 0.8));
        System.out.println(convertEurToUsd(150, 0.9));
    }

    public static double convertEurToUsd(int eur, double course) { //перевод евро в доллар
        //напишите тут ваш код
        double usd = eur * course;
        return usd;
    }
}
