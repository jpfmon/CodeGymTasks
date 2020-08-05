package com.codegym.task.task14.task1408;

public class EuropeanHen extends Hen{
    @Override
    int getMonthlyEggCount() {
        return 11;
    }
    @Override
    String getDescription() {
        String text = super.getDescription() + " I come from Europe. I lay " + this.getMonthlyEggCount() + " eggs a month.";
        return text;
    }
}