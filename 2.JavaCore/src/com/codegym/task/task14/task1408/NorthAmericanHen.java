package com.codegym.task.task14.task1408;

public class NorthAmericanHen extends Hen{

    @Override
    int getMonthlyEggCount() {
        return 10;
    }

    @Override
    String getDescription() {
        String text = super.getDescription() + " I come from North America. I lay " + this.getMonthlyEggCount() + " eggs a month.";
        return text;
    }
}