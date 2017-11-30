package com.blazerg.application.poketeambuilder

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@ComponentScan(basePackages = 'com.blazerg.application.poketeambuilder')
@EnableJpaRepositories(basePackages = 'com.blazerg.application.poketeambuilder.domain.repository')
@EnableAutoConfiguration
@SpringBootApplication
class PoketeamBuilderApplication {

    static void main(String[] args) {
        SpringApplication.run PoketeamBuilderApplication, args
    }
}
