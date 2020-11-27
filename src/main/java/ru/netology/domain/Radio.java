package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int firstRadioStation = 0;
    private int lastRadioStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public void setNextRadioStation() {
        if (currentRadioStation == lastRadioStation) {
            this.currentRadioStation = firstRadioStation;
            return;
        }
        this.currentRadioStation++;
    }

    public void setPreviousRadioStation() {
        if (currentRadioStation == firstRadioStation) {
            this.currentRadioStation = lastRadioStation;
            return;
        }
        this.currentRadioStation--;
    }

    public void volumeUp() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void volumeDown() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume--;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > lastRadioStation) {
            this.currentRadioStation = lastRadioStation;
            return;
        }
        if (currentRadioStation < firstRadioStation) {
            this.currentRadioStation = firstRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getFirstRadioStation() {
        return firstRadioStation;
    }

    public int getLastRadioStation() {
        return lastRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
