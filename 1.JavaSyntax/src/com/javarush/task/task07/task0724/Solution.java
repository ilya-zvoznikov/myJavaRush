package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human papaPapy = new Human("Вова", true, 78);
        Human mamaPapy = new Human("Оля", false, 78);
        Human papaMamy = new Human("Лёня", true, 88);
        Human mamaMamy = new Human("Нина", false, 87);
        Human papa = new Human("Костя", true, 55, papaPapy, mamaPapy);
        Human mama = new Human("Лена", false, 54, papaMamy, mamaMamy);
        Human daughter = new Human("Маша", false, 33, papa, mama);
        Human son1 = new Human("Илья", true, 29, papa, mama);
        Human son2 = new Human("Андрей", true, 23, papa, mama);
        System.out.println(papaPapy.toString());
        System.out.println(mamaPapy.toString());
        System.out.println(papaMamy.toString());
        System.out.println(mamaMamy.toString());
        System.out.println(papa.toString());
        System.out.println(mama.toString());
        System.out.println(daughter.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;


        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















