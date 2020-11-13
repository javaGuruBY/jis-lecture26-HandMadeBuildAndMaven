package by.jrr.facade.service.houses;

import by.jrr.facade.service.*;

public class SmartHomeService implements SmartHomeServiceI {

    HeaterService heaterService;
    KintchenService kintchenService;
    LightService lightService;
    WindowService windowService;

    public void ownerIsHome() {


        lightService.setKitchenLightOn();

        heaterService.setBathroomTempetureHot();
        heaterService.setBedroomTempetureHot();
        heaterService.setKintchenTempetureHot();

        kintchenService.makeSmoozy();

        windowService.setCurteinsUp();
    }
}
