package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String secondName;
        private Boolean sex;
        private int age;
        private int weight;
        private int height;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String secondName) {
            this.name = name;
            this.secondName = secondName;
        }

        public Human(String name, String secondName, Boolean sex) {
            this.name = name;
            this.secondName = secondName;
            this.sex = sex;
        }

        public Human(String name, String secondName, Boolean sex, int age) {
            this.name = name;
            this.secondName = secondName;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, String secondName, Boolean sex, int age, int weight) {
            this.name = name;
            this.secondName = secondName;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, String secondName, Boolean sex, int age, int weight, int height) {
            this.name = name;
            this.secondName = secondName;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, String secondName, int age) {
            this.name = name;
            this.secondName = secondName;
            this.age = age;
        }

        public Human(String name, Boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, Boolean sex, int age, int weight, int height) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(Boolean sex, int age) {
            this.sex = sex;
            this.age = age;
        }
    }
}
