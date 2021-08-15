package com.example.springtestingtrainer.service;

import com.example.springtestingtrainer.DebtorObjectMother;
import com.example.springtestingtrainer.entity.Debtor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DesicionMakerTest {

    @Test
    public void canDesicionMakerDecide() {

        var mockCalculator = mock(Calculator.class);
        when(mockCalculator.add(60, 30)).thenReturn(90);
        when(mockCalculator.add(30, 30)).thenReturn(60);
        when(mockCalculator.add(60, 60)).thenReturn(120);

        when(mockCalculator.countWords("qwe")).thenReturn(3);
        when(mockCalculator.countWords("qwerttrewq123")).thenReturn(13);
        when(mockCalculator.countWords("qweewq")).thenReturn(6);

        var decisionMaker = new DecisionMaker(new Calculator()); //problem 1

        var testDebtor = new Debtor("qwe", 60, 30);
        var testDebtor2 = new Debtor("qwerttrewq123", 30, 30);
        var testDebtor3 = new Debtor("qweewq", 60, 60);

        var testDebtor4 = DebtorObjectMother.valid().build();
        var testDebtor5 = DebtorObjectMother.valid()
                .debt(30)
                .name("qwerttrewq123")
                .build();
        var testDebtor6 = new Debtor("qweewq", 60, 60);

        var decisionMakerWithMock = new DecisionMaker(mockCalculator);

        assertTrue(decisionMaker.canIncreaseDebt(testDebtor));
        assertFalse(decisionMaker.canIncreaseDebt(testDebtor2));
        assertFalse(decisionMaker.canIncreaseDebt(testDebtor3));

        assertTrue(decisionMakerWithMock.canIncreaseDebt(testDebtor4));
        assertFalse(decisionMakerWithMock.canIncreaseDebt(testDebtor5));
        assertFalse(decisionMakerWithMock.canIncreaseDebt(testDebtor6));
    }
}
