package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.*;

/* 
Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Использовать StringBuilder.

Пример содержимого файла
рот тор торт о
о тот тот тот

Вывод:
рот тор
о о
тот тот


Требования:
1. Метод main должен считывать имя файла с клавиатуры.
2. В методе main должен быть использован StringBuilder
3. Список result должен быть заполнен корректными парами согласно условию задачи.
4. В классе Solution должен содержаться вложенный класс Pair.
5. В классе Pair должен быть объявлен конструктор без параметров (или конструктор по умолчанию).
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        StringBuilder file = new StringBuilder();

        BufferedReader bufferedFileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)/*, "windows-1251"*/));
        while (bufferedFileReader.ready()) {
            file.append(bufferedFileReader.readLine()).append(" ");
        }
        bufferedFileReader.close();

        String[] words = file.toString().split("\\s+");
        ArrayList<String> listWords = new ArrayList<>();

        for (String s : words
                ) {
            listWords.add(s.trim());
        }

        /*for (int i = 0; i < listWords.size(); i++) {
            for (int j = i + 1; j < listWords.size(); j++) {
                if (listWords.get(i).equals(new StringBuilder(listWords.get(j)).reverse().toString())) {
                    result.add(new Pair(listWords.get(i), listWords.get(j)));
                    listWords.remove(j);
                    listWords.remove(i);
                    j--;
                }
            }
        }*/

        for (int i = 0; i < listWords.size(); i++) {
            for (int j = i + 1; j < listWords.size(); j++) {
                if ((listWords.get(i) != null) && (listWords.get(j) != null)) {
                    if (listWords.get(i).equals(new StringBuilder(listWords.get(j)).reverse().toString())) {
                        result.add(new Pair(listWords.get(i), listWords.get(j)));
                        listWords.set(j, null);
                        listWords.set(i, null);
                    }
                }
            }
        }

        for (Pair pair : result
                ) {
            System.out.println(String.format("%s %s", pair.first, pair.second));
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
