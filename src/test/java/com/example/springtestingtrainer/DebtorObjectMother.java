package com.example.springtestingtrainer;

import com.example.springtestingtrainer.entity.Debtor;

public class DebtorObjectMother {

    public static Debtor.DebtorBuilder valid() {
        return Debtor.builder()
                .debt(60)
                .name("qwe")
                .additionalMoney(30);
    }
}
