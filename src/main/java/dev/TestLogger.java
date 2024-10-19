package dev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger {
    public static void main(String[] args) {
        Logger LOGGER = LoggerFactory.getLogger(TestLogger.class);

        LOGGER.info("Bonjour Slf4J !");
        LOGGER.info("Implémentation Logback");
    }
}
