package by.jrr.facade.service;

public class KintchenService {
    private Light mainLight = new Light();
    private Light nightLight = new Light();

    public Light getMainLight() {
        return mainLight;
    }

    private void setMainLight(Light mainLight) {
        this.mainLight = mainLight;
    }

    public Light getNightLight() {
        return nightLight;
    }

    private void setNightLight(Light nightLight) {
        this.nightLight = nightLight;
    }

    public void turnOnTheLight() {
        mainLight.setLightOn();
        nightLight.setLightOn();
    }

    public void turnOnNightLight() {
        nightLight.setLightOn();
    }

    public void makeSmoozy() {}
    public void makeSoup() {}
}
