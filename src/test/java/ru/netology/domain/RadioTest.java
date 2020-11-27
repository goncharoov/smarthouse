package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetRadioStation() {
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetRadioStation() {
        radio.setCurrentRadioStation(10);
        assertEquals(9, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldSetNextRadioStation() {
        radio.setCurrentRadioStation(5);
        radio.setNextRadioStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetPreviousRadioStation() {
        radio.setCurrentRadioStation(5);
        radio.setPreviousRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetNextRadioStationAfterLast() {
        radio.setCurrentRadioStation(9);
        radio.setNextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetPreviousRadioStationAfterFirst() {
        radio.setCurrentRadioStation(0);
        radio.setPreviousRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolume() {
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp() {
        radio.setCurrentVolume(5);
        radio.volumeUp();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown() {
        radio.setCurrentVolume(5);
        radio.volumeDown();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotVolumeUpFromMax() {
        radio.setCurrentVolume(10);
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotVolumeDownFromMin() {
        radio.setCurrentVolume(0);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
}
