package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    //public static char[] soglas = new char[]{'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ь'};


    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = s.replaceAll(" ", "");
        ArrayList<Character> glas = new ArrayList<>();
        ArrayList<Character> sogl = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) glas.add(s.charAt(i));
            //if (isSoglas(s.charAt(i)))
            else
                sogl.add(s.charAt(i));

        }
        for (Character a : glas
             ) {
            System.out.print(a + " ");
        }
        System.out.print("\n");
        for (Character a : sogl
                ) {
            System.out.print(a + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
    // метод проверяет, согласная ли буква
    /*public static boolean isSoglas(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : soglas)   // ищем среди массива согласных
        {
            if (c == d)
                return true;
        }
        return false;
    }*/
}