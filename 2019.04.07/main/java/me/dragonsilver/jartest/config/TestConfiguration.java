package me.dragonsilver.jartest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
public class TestConfiguration {

    @Bean
    public String hello() {
        return "hello-dev";
    }
}
