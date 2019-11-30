package com.zhaozy.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(TestApplication.class, args);
        LOGGER.info("boot-hello : 启动成功！");
    }

}
