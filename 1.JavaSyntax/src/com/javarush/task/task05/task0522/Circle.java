package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle() {

    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 10;
    }

    public Circle(double radius) {
        this.x = 0;
        this.y = 0;
        this.radius = radius;
    }

    public Circle(Circle anotherCircle) {
        this.x = anotherCircle.x;
        this.y = anotherCircle.y;
        this.radius = anotherCircle.radius;
    }


    public static void main(String[] args) {

    }
}