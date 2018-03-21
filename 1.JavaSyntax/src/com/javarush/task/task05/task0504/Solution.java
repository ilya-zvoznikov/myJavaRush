package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
    Cat cat1 = new Cat("Vaska", 2, 10, 9);
    Cat cat2 = new Cat("Elya", 6, 4, 10);
    Cat cat3 = new Cat("Zhuzha", 7, 6, 5);
    cat1.name = "Manya";

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }




}