package ru.netology.domain;

public class Radio {

    private int id = 1;
    private String name = "HomePod";
    private int currentRadioStation;
    private int firstRadioStation = 0;
    private int lastRadioStation = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(){}

    public Radio(int id, String name, int currentRadioStation, int firstRadioStation, int lastRadioStation, int currentVolume, int minVolume, int maxVolume) {
        this.id = id;
        this.name = name;
        this.currentRadioStation = currentRadioStation;
        this.firstRadioStation = firstRadioStation;
        this.lastRadioStation = lastRadioStation;
        this.currentVolume = currentVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

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

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getId() {  return id; }

    public String getName() { return name; }

    public int getFirstRadioStation() { return firstRadioStation; }

    public int getLastRadioStation() { return lastRadioStation; }

    public int getMinVolume() { return minVolume; }

    public int getMaxVolume() { return maxVolume; }
}
