package com.bawi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLoggingAppJdk14 {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyLoggingAppJdk14.class);

    public static void main(String[] args) {
        logHello();
    }

    static void logHello() {
        LOGGER.info("Hello world!");
    }
}
