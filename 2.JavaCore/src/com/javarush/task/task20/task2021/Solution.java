package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Сериализация под запретом
*/
public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        @Override
        public String toString() {
            return "SubSolution{}";
        }

        private void writeObject(ObjectOutputStream stream) throws NotSerializableException {
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream stream) throws NotSerializableException {
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SubSolution subSolution = new SubSolution();
        System.out.println(subSolution.toString());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(subSolution);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SubSolution newSubsolution = (SubSolution) ois.readObject();
        System.out.println(newSubsolution.toString());
    }
}
