package by.jrr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class LogBack {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogBack.class);
        logger.debug("debug message");
        logger.info("info message");
        logger.error("error message");

        //print internal state
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
}
