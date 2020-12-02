package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldUseAllArgsConstructor() {
        Radio radio = new Radio(
                1,
                "HomePod",
                0,
                0,
                10,
                0,
                0,
                100
        );
        assertEquals(1, radio.getId());
        assertEquals("HomePod", radio.getName());
        assertEquals(0, radio.getCurrentRadioStation());
        assertEquals(0, radio.getFirstRadioStation());
        assertEquals(10, radio.getLastRadioStation());
        assertEquals(0, radio.getCurrentVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldUseNoArgsConstructor() {
        Radio radio = new Radio();
        assertEquals(1, radio.getId());
        assertEquals("HomePod", radio.getName());
        assertEquals(0, radio.getCurrentRadioStation());
        assertEquals(0, radio.getFirstRadioStation());
        assertEquals(10, radio.getLastRadioStation());
        assertEquals(0, radio.getCurrentVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        assertEquals(10, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setNextRadioStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetPreviousRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setPreviousRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetNextRadioStationAfterLast() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.setNextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetPreviousRadioStationAfterFirst() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setPreviousRadioStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.volumeUp();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.volumeDown();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotVolumeUpFromMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.volumeUp();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotVolumeDownFromMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
}
