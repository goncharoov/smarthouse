package ru.netology.domain;

public class Conditioner {

    private String name;
    private int currentTemp;
    private int minTemp = 16;
    private int maxTemp = 30;
    private boolean on;

    public void increseCurrentTemp() {
        if (currentTemp == maxTemp) {
            return;
        }
        this.currentTemp++;
    }

    public void decreseCurrentTemp() {
        if (currentTemp == minTemp) {
            return;
        }
        this.currentTemp--;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        if (currentTemp > maxTemp) {
            return;
        }
        if (currentTemp < minTemp) {
            return;
        }
            this.currentTemp = currentTemp;
    }

}
