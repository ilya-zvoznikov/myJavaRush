package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Иванов", new Date("SEPTEMBER 13 1968"));
        map.put("Федорин", new Date("FEBRUARY 15 1986"));
        map.put("Блинов", new Date("JANUARY 26 1990"));
        map.put("Жилин", new Date("OCTOBER 12 1986"));
        map.put("Герцев", new Date("AUGUST 5 1965"));
        map.put("Устинов", new Date("JULY 25 1977"));
        map.put("Бешенцев", new Date("APRIL 17 1985"));
        map.put("Клят", new Date("NOVEMBER 29 1985"));
        map.put("Юдин", new Date("MAY 15 1992"));
        return map;


        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        for (HashMap.Entry<String, Date> pair : map.entrySet()
             ) {
            Date value = pair.getValue();
            String key = pair.getKey();
            int day = value.getDate();
            int month = value.getMonth();
            if ((day >= 1) && (day <= 31) && (month >= 5) && (month <= 7)) {
                map.remove(key, value);
            }

        }

    }

    public static void main(String[] args) {

    }
}
