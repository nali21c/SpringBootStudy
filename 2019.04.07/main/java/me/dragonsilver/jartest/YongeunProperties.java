package me.dragonsilver.jartest;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Component
@ConfigurationProperties("yongeun")
@Validated
class YongeunProperties {
    private int age;
    @NotEmpty
    private String name;
    private String Fullname;

    private Duration sessionTimeout = Duration.ofSeconds(30);

    public Duration getSessionTimeout() { return sessionTimeout; }

    public void setSessionTimeout(Duration sessionTimeout) { this.sessionTimeout = sessionTimeout; }

    public int getAge() { return age; }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }
}
