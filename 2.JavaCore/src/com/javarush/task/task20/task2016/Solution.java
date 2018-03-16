package com.javarush.task.task20.task2016;

import java.io.*;

/*
Минимум изменений
*/
public class Solution {
    public static class A implements Serializable {
        String name = "A";

        public A(String name) {
            this.name += name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class B extends A {
        String name = "B";

        public B(String name) {
            super(name);
            this.name += name;
        }
    }

    public static class C extends B {
        String name = "C";

        public C(String name) {
            super(name);
            this.name = name;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File myFile = File.createTempFile("myFile", ".txt");
        FileOutputStream fos = new FileOutputStream(myFile);
        FileInputStream fis = new FileInputStream(myFile);
        C cc = new C("C");

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cc);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(fis);
        C cC = (C) ois.readObject();
        ois.close();
        System.out.println(cc.equals(cC));
    }

}
