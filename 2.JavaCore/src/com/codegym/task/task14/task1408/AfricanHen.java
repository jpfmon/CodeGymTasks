package com.codegym.task.task14.task1408;

public class AfricanHen extends Hen{
    @Override
    int getMonthlyEggCount() {
        return 13;
    }
    @Override
    String getDescription() {
        String text = super.getDescription() + " I come from Africa. I lay " + this.getMonthlyEggCount() + " eggs a month.";
        return text;
    }
}