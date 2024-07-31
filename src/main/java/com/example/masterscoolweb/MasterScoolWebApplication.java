package com.example.masterscoolweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MasterScoolWebApplication {

    public static void main(String[] args) {

        SpringApplication.run(MasterScoolWebApplication.class, args);

    }

}
