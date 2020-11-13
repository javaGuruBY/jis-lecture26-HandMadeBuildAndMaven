package by.jrr;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseLogger {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(BaseLogger.class.getName());

        logger.setLevel(Level.INFO);
        logger.log(Level.SEVERE, logger.getLevel().toString());
        logger.warning("warning message");
        logger.info("info message");

        logger.setLevel(Level.WARNING);
        logger.log(Level.ALL, logger.getLevel().toString());
        logger.warning("warning message");
        logger.info("info message");

        Logger fileLog = Logger.getLogger("logfile");
        FileHandler fileHandler = new FileHandler("./javaUtilLogger.log", true);
        fileLog.addHandler(fileHandler);
        fileLog.setLevel(Level.INFO);
        fileLog.info("this logs to a file");
    }
}
