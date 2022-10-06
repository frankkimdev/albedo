package com.astronaut.albedo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class AlbedoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlbedoApplication.class, args);
    }

}
