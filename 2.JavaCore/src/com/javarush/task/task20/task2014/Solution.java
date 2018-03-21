package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(new Solution(5));

        File fileName = File.createTempFile("my_file.txt", "");

        FileInputStream fis = new FileInputStream(fileName);
        FileOutputStream fos = new FileOutputStream(fileName);

        Solution savedObject = new Solution(11);

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(savedObject);

        Solution loadedObject = new Solution(10);
        ObjectInputStream ois = new ObjectInputStream(fis);
        loadedObject = (Solution) ois.readObject();
        System.out.println(savedObject.string.equals(loadedObject.string) ? "yes" : "no");

    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
