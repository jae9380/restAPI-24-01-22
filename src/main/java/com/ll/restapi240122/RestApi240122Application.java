package com.ll.restapi240122;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RestApi240122Application {

    public static void main(String[] args) {
        SpringApplication.run(RestApi240122Application.class, args);
    }

}
