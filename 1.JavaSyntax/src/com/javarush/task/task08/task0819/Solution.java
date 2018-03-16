package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        for(Cat c : cats) {
            cats.remove(c);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> set = new HashSet<>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        return set;
        //return null;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat c : cats
             ) {
            System.out.println(c);
        }
    }

    // step 1 - пункт 1
    public static class Cat {
        public Cat() {

        }
    }
}
