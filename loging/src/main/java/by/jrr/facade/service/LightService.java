package by.jrr.facade.service;

public class LightService {
    KintchenService kintchenService = new KintchenService();

    public void setTamburLightOn() { }
    public void setYardLightOn() { }
    public void setKitchenLightOn() {
        kintchenService.turnOnTheLight();
    }

    public KintchenService getKintchenService() {
        return kintchenService;
    }

    public void setSmoozeLight() {
        kintchenService.turnOnNightLight();
    }




}
