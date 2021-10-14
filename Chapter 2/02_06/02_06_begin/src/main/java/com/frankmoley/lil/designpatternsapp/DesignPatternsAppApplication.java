package com.frankmoley.lil.designpatternsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import prototype.ProtoFalse;
import prototype.ProtoTrue;

@SpringBootApplication
public class DesignPatternsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsAppApplication.class, args);
    }

    @Bean
    public ProtoFalse protoFalse() {
        return new ProtoFalse();
    }

    //this is all we have to do to make our bean prototype.
    //we can test that prototype works by comparing two instances of both proto false and proto
    //true. We would expect protoTrue objects be unique and protoFalse be identical.
    @Bean
    @Scope("prototype")
    public ProtoTrue protoTrue() {
        return new ProtoTrue();
    }

}

