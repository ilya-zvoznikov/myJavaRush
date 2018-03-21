package com.javarush.task.task20.task2020;

import java.io.*;
import java.util.logging.Logger;

/* 
Сериализация человека
*/
public class Solution {

    public static class Person implements Serializable {
        String firstName;
        String lastName;
        transient String fullName;
        transient /*final */String greetingString;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greetingString = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }

        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(fullName);
            stream.writeObject(greetingString);
//            stream.writeObject(outputStream);
//            stream.writeObject(logger);
        }

        private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
            stream.defaultReadObject();
            fullName = (String) stream.readObject();
        greetingString = (String) stream.readObject();
//            outputStream = (PrintStream) stream.readObject();
//            logger = (Logger) stream.readObject();
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Ivan", "Ivanov", "Russia", Sex.MALE);
        person.outputStream.println(String.format("%s %s %s %s %s %s", person.firstName, person.lastName, person.fullName, person.greetingString, person.country, person.sex));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(person);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Person person1 = (Person) ois.readObject();
        ois.close();
//        person1 = new Person(person1.firstName, person1.lastName, person1.country, person1.sex);
        System.out.println(String.format("%s %s %s %s %s %s", person1.firstName, person1.lastName, person1.fullName, person1.greetingString, person1.country, person1.sex));
    }
}
