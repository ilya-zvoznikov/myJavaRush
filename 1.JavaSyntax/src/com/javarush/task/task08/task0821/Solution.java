package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Игорь");
        map.put("Герцев", "Олег");
        map.put("Нетребин", "Дмитрий");
        map.put("Иванов", "Олег");
        map.put("Рамзин", "Иван");
        map.put("Нетребин", "Игорь");
        map.put("Юдин", "Евгений");
        map.put("Иванов", "Александр");
        map.put("Юдин", "Евгений");
        map.put("Блинов", "Иван");

        //return null;
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
