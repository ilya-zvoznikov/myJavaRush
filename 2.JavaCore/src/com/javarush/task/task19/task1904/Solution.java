package com.javarush.task.task19.task1904;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        /*Scanner sca = new Scanner("Иванов Иван Иванович 31 12 2000");
        PersonScannerAdapter psa = new PersonScannerAdapter(sca);
        Person p = psa.read();
        System.out.println(p);*/
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
//            BufferedReader reader = new BufferedReader(new FileReader("D:\\1.txt"));
//            String str = reader.readLine();
            String str = fileScanner.nextLine();
            String[] strArr = str.trim().split(" ", 4);

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
            Date personDate = null;
            try {
                personDate = simpleDateFormat.parse(strArr[3]);
            } catch (ParseException e) {
            }

//            personDate.setDate(Integer.parseInt(strArr[3]));
//            personDate.setMonth(Integer.parseInt(strArr[4]) - 1);
//            personDate.setYear(calendar.YEAR);
//            System.out.println(str);
            return new Person(strArr[1], strArr[2], strArr[0], personDate);
//            return null;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
