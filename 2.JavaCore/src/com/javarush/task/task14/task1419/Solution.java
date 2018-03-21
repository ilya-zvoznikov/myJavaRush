package com.javarush.task.task14.task1419;

import com.sun.corba.se.spi.orbutil.threadpool.NoSuchThreadPoolException;
import com.sun.corba.se.spi.orbutil.threadpool.NoSuchWorkQueueException;

import javax.crypto.ExemptionMechanismException;
import java.awt.geom.NoninvertibleTransformException;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        exceptions.add(new NullPointerException());
        exceptions.add(new NoSuchMethodException());
        exceptions.add(new NoSuchThreadPoolException());
        exceptions.add(new NoSuchWorkQueueException());
        exceptions.add(new NegativeArraySizeException());
        exceptions.add(new NoSuchFieldException());
        exceptions.add(new ExemptionMechanismException());
        exceptions.add(new EOFException());
        exceptions.add(new IOException());


        //напишите тут ваш код

    }
}
