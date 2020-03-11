package com.logback.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogBackConfig {

    private final static Logger log = LoggerFactory.getLogger(LogBackConfig.class);
    public static void main(String[] args) {
        SpringApplication.run(LogBackConfig.class, args);
        log.warn("project has started");
    }

}
