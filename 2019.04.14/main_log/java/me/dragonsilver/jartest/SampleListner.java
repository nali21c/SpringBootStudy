package me.dragonsilver.jartest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

@Component
public class SampleListner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(SampleListner.class);

    @Value("${yongeun.name}")
    private String name;

    @Autowired
    YongeunProperties YongeunProperties;

    @Autowired
    private String hello;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.debug("===================");
        logger.debug(name);
        logger.debug(YongeunProperties.getName());
        logger.debug(YongeunProperties.getFullname());
        logger.debug("===================");

/*
        System.out.println("+++++++++++++++++");
        System.out.println(name);
        System.out.println("+++++++++++++++++");
        System.out.println(YongeunProperties.getAge());
        System.out.println(YongeunProperties.getFullname());
        System.out.println(YongeunProperties.getName());
        System.out.println(YongeunProperties.getSessionTimeout());
        System.out.println("-------------------------");
        System.out.println(hello);
        */
    }
}
