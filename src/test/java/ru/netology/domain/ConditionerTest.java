package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @Test
    public void shouldIncreaseCurrentTemp() {
        conditioner.setCurrentTemp(20);
        conditioner.increseCurrentTemp();
        assertEquals(21, conditioner.getCurrentTemp());
    }

    @Test
    public void shouldDecreaseCurrentTempFromMin() {
        conditioner.setCurrentTemp(16);
        conditioner.decreseCurrentTemp();
        assertEquals(16, conditioner.getCurrentTemp());
    }

    @Test
    public void shouldIncreaseCurrentTempFromMax() {
        conditioner.setCurrentTemp(30);
        conditioner.increseCurrentTemp();
        assertEquals(30, conditioner.getCurrentTemp());
    }

    @Test
    public void shouldDecreaseCurrentTemp() {
        conditioner.setCurrentTemp(20);
        conditioner.decreseCurrentTemp();
        assertEquals(19, conditioner.getCurrentTemp());
    }

    @Test
    public void shouldNotSetMaxCurrentTemp() {
        conditioner.setCurrentTemp(31);
        assertEquals(0, conditioner.getCurrentTemp());
    }

    @Test
    public void shouldNotSetMinCurrentTemp() {
        conditioner.setCurrentTemp(15);
        assertEquals(0, conditioner.getCurrentTemp());
    }

    @Test
    public void shouldSetMaxCurrentTemp() {
        conditioner.setCurrentTemp(30);
        assertEquals(30, conditioner.getCurrentTemp());
    }

    @Test
    public void shouldSetMinCurrentTemp() {
        conditioner.setCurrentTemp(16);
        assertEquals(16, conditioner.getCurrentTemp());
    }
}
