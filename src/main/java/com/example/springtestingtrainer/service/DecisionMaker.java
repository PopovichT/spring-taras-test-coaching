package com.example.springtestingtrainer.service;

import com.example.springtestingtrainer.entity.Debtor;

public class DecisionMaker {

    private Calculator calculator;

    public DecisionMaker(Calculator calculator) {
        this.calculator = calculator;
    }

    public boolean canIncreaseDebt(Debtor debtor) {
        int resultMoney = calculator.add(debtor.getDebt(), debtor.getAdditionalMoney());
        int resultNameLength = calculator.countWords(debtor.getName());

        if (resultMoney > 100) {
            return false;
        }
        if (resultNameLength > 10) {
            return false;
        }
        return true;
    }
}
