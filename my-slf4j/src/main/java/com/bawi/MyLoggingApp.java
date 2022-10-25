package com.bawi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLoggingApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyLoggingApp.class);

    public static void main(String[] args) {
        logHello();
    }

    static void logHello() {
        LOGGER.info("Hello world!");
    }
}
