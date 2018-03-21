package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
Сформируй часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.

Пример:
{name=Ivanov, country=Ukraine, city=Kiev, age=null}

Результат:
name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'


Требования:
1. Метод getQuery должен принимать один параметр типа Map.
2. Метод getQuery должен иметь тип возвращаемого значения String.
3. Метод getQuery должен быть статическим.
4. Метод getQuery должен возвращать строку сформированную по правилам описанным в условии задачи.
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        /*map.put("name", "Ivanov");
        map.put("country", null);
        map.put("city", "Kiev");
        map.put("age", "23");*/
        map.put("name", null);
        map.put("country", "dfgdfg");
        map.put("city", null);
        map.put("age", null);
        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()
                ) {
            String key = pair.getKey();
            String value = pair.getValue();
            if (key != null && value != null) {
                stringBuilder.append(key).append(" = '").append(value).append("' and ");
            } else stringBuilder.append("");
        }
        if (stringBuilder.toString().equals("")) return "";
        return stringBuilder.substring(0, stringBuilder.length() - 5).toString();
//        return null;
    }
}
