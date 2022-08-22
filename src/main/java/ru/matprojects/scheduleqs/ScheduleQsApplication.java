package ru.matprojects.scheduleqs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ScheduleQsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleQsApplication.class, args);
    }

}
