package by.jrr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jSimple {
    public static void main(String[] args) {
        Integer age = 24;
        String name = "Anton";
        String job = "Software Engineer";
        String company = "JavaGuru";
        Logger logger = LoggerFactory.getLogger(Slf4jSimple.class);
        logger.info("At the age of {} {} got his first job as a {} at {}", age, name, job, company);
    }
}
