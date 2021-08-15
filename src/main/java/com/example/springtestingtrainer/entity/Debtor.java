package com.example.springtestingtrainer.entity;

import lombok.Builder;

@Builder
public class Debtor {

    private String name;
    private Integer debt;
    private Integer additionalMoney;

    public Debtor (String name, Integer debt, Integer add) {
        this.name = name;
        this.debt = debt;
        this.additionalMoney = add;
    }

    public String getName() {
        return name;
    }

    public Integer getDebt() {
        return debt;
    }
    public Integer getAdditionalMoney() {
        return additionalMoney;
    }
}
