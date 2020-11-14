package by.jrr.jis.service;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MessageService {

    public static String getRandom() {
        return Arrays.asList(
                "Message updated",
                "Message updated",
                "Message updated",
                "Message updated").get(ThreadLocalRandom.current().nextInt(0, 3));

    }

    public static String getVersion() {
        return "v1.0.1-snapshot";
    }
}
