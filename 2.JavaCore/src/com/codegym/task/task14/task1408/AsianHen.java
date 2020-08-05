package com.codegym.task.task14.task1408;

public class AsianHen extends Hen{

    @Override
    int getMonthlyEggCount() {
        return 12;
    }
    @Override
    String getDescription() {
        String text = super.getDescription() + " I come from Asia. I lay " + this.getMonthlyEggCount() + " eggs a month.";
        return text;
    }

}