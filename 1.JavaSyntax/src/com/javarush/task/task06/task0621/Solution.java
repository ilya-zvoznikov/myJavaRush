package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите имя дедушки:");
        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        System.out.println("Введите имя бабушки:");
        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        System.out.println("Введите имя папы:");
        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandfather, null);

        System.out.println("Введите имя мамы:");
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandmother);

        System.out.println("Введите имя сына:");
        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        System.out.println("Введите имя дочери:");
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

       /* Cat(String name, Cat father) {
            this.name = name;
            this.father = father;
        }
        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        } */

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if (father == null) {
                if (mother == null)
                    return "Cat name is " + name + ", no mother, no father";
                else
                    return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            }
            else {
                if (mother == null)
                    return "Cat name is " + name + ", no mother, father is " + father.name;
                else
                    return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            }
        }
    }

}
