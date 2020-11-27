package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @Test
    public void shouldIncreaseCurrentTemp() {
        conditioner.setCurrentTemp(30);
        conditioner.increseCurrentTemp();
        assertEquals(30, conditioner.getCurrentTemp());
    }

    @Test
    public void shouldDecreaseCurrentTemp() {
        conditioner.setCurrentTemp(16);
        conditioner.decreseCurrentTemp();
        assertEquals(16, conditioner.getCurrentTemp());
    }

}
