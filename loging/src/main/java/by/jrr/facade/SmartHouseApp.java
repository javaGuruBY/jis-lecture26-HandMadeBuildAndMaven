package by.jrr.facade;

//Принцип проектирования
//Принцип минимальной информированности: общайтесь только с близкими друзьями.
//
//        из любого метода объекта должны вызываться только методы, принадлежащие:
//        - самому объекту;
//        - объектам, переданным в параметрах метода;
//        - любому объекту, созданному внутри метода;
//        - любым компонентам объекта.

import by.jrr.facade.service.houses.DummyHomeService;

import by.jrr.facade.service.houses.SmartHomeServiceI;

public class SmartHouseApp {
    public static void main(String[] args) {
        SmartHomeServiceI smartHomeService = new DummyHomeService();
        smartHomeService.ownerIsHome();
    }
}
