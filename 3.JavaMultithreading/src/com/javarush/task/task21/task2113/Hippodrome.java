package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void move() {
        for (Horse h : horses
                ) {
            h.move();
        }
    }

    public void print() {
        for (Horse h : horses
                ) {
            h.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }

    public Horse getWinner() {
        List<Double> distanceHorses = new ArrayList<>();
        for (Horse h : horses
                ) {
            distanceHorses.add(h.getDistance());
        }
        double dist = Collections.max(distanceHorses);
        for (Horse h : horses
                ) {
            if (h.getDistance() == dist) return h;
        }
        return null;
    }

    public void printWinner() {
        System.out.println(String.format("Winner is %s!", getWinner().getName()));
    }

    public static void main(String[] args) {
        List<Horse> horseList = new ArrayList<>();
        game = new Hippodrome(horseList);
        horseList.add(new Horse("Первая лошадка", 3, 0));
        horseList.add(new Horse("Вторая лошадка", 3, 0));
        horseList.add(new Horse("Третья лошадка", 3, 0));
        game.run();
        game.printWinner();
    }
}
