package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.net.HttpURLConnection;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> ch4 = new ArrayList<>();
        ArrayList<Human> ch5 = new ArrayList<>();
        ArrayList<Human> ch6 = new ArrayList<>();
        Human doch = new Human("Маша", false, 33, ch4);
        Human son1 = new Human("Илья", true, 29, ch5);
        Human son2 = new Human("Андрей", true, 23, ch6);
        ArrayList<Human> ch1 = new ArrayList<>();
        ch1.add(doch);
        ch1.add(son1);
        ch1.add(son2);
        Human papa = new Human("Костя", true, 55, ch1);
        ArrayList<Human> ch2 = new ArrayList<>();
        ch2.add(papa);
        Human mama = new Human("Алена", false, 54, ch1);
        ArrayList<Human> ch3 = new ArrayList<>();
        ch3.add(mama);
        Human ded1 = new Human("Вова", true, 78, ch2);
        Human bab1 = new Human("Оля", false, 78, ch2);
        Human ded2 = new Human("Лёня", true, 88, ch3);
        Human bab2 = new Human("Нина", false, 87, ch3);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(doch);
        System.out.println(son1);
        System.out.println(son2);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        /*public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }*/
        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
