package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream("D:\\1.txt");
            InputStream inputStream = new FileInputStream("D:\\1.txt");

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут

            User user1 = new User();
            user1.setFirstName("Ivan");
            user1.setLastName("Ivanov");
            user1.setBirthDate(new Date(1998,7,17));
            user1.setMale(true);
            user1.setCountry(User.Country.UKRAINE);

            User user2 = new User();
            user2.setFirstName("Petr");
            user2.setLastName("Petrov");
            user2.setBirthDate(new Date(1988,5,7));
            user2.setMale(false);
            user2.setCountry(User.Country.RUSSIA);

            javaRush.users.add(user1);
            javaRush.users.add(user2);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println("--------------------\nОбъекты равны? - " + (javaRush.equals(loadedObject) ? "да" : "нет") + "\n--------------------");

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            for (User user : this.users
                    ) {
                bufferedWriter.write(user.getFirstName());
                bufferedWriter.newLine();
                bufferedWriter.write(user.getLastName());
                bufferedWriter.newLine();
                bufferedWriter.write(String.valueOf(user.getBirthDate().getTime()));
                bufferedWriter.newLine();
                bufferedWriter.write(((Boolean) user.isMale()).toString());
                bufferedWriter.newLine();
                bufferedWriter.write(user.getCountry().toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (bufferedReader.ready()) {
                User user = new User();
                user.setFirstName(bufferedReader.readLine());

                user.setLastName(bufferedReader.readLine());

                user.setBirthDate(new Date(Long.parseLong(bufferedReader.readLine())));

                user.setMale(Boolean.parseBoolean(bufferedReader.readLine()));

                String coun = bufferedReader.readLine();
                user.setCountry(coun.equals("UKRAINE") ? User.Country.UKRAINE : coun.equals("RUSSIA") ? User.Country.RUSSIA : User.Country.OTHER);

                this.users.add(user);

            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
