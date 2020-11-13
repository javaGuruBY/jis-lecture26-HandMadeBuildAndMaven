package by.jrr.jis4;

import by.jrr.jis.service.MessageService;

public class AppRunner {
    public static void main(String[] args) {
        System.out.println(MessageService.getVersion());
    }
}
