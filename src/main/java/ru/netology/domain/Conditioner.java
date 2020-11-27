package ru.netology.domain;

public class Conditioner {

    private String name;
    private int currentTemp;
    private int minTemp = 16;
    private int maxTemp = 30;
    private boolean on;

    public void increseCurrentTemp(int currentTemp) {
        if (currentTemp == maxTemp) {
            return;
        }
        this.currentTemp++;
    }

    public void decreseCurrentTemp(int currentTemp) {
        if (currentTemp == minTemp) {
            return;
        }
        this.currentTemp--;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


}
