package com.javarush.task.task14.task1408;

class UkrainianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 400;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}