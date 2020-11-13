package by.jrr.facade.service.houses;

import by.jrr.facade.service.*;

public class DummyHomeService implements SmartHomeServiceI {

    HeaterService heaterService;
    KintchenService kintchenService;
    LightService lightService;
    WindowService windowService;

    public void ownerIsHome() {

        lightService.setYardLightOn();
        lightService.setTamburLightOn();

        lightService.setKitchenLightOn();

        //нарушен принцип минимальной информированности
        lightService.getKintchenService().getMainLight().setLightOn();
        lightService.getKintchenService().getNightLight().setLightOn();
        //соблюден принцип минимальной информированности


        heaterService.setBathroomTempetureHot();
        heaterService.setBedroomTempetureHot();
        heaterService.setKintchenTempetureHot();

        kintchenService.makeSoup();

        windowService.setCurteinsDown();
    }
}
