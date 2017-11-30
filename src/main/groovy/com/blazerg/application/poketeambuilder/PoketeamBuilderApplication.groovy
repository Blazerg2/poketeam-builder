package com.blazerg.application.poketeambuilder

import io.swagger.annotations.Api
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Api
@Controller
@ComponentScan(basePackages = 'com.blazerg.application.poketeambuilder')
@EnableJpaRepositories(basePackages = 'com.blazerg.application.poketeambuilder.domain.repository')
@EnableAutoConfiguration
@SpringBootApplication
class PoketeamBuilderApplication {

    @RequestMapping(value = "/")
    @ResponseBody
    String herokuTest(){
        "Hello world!"
    }

    static void main(String[] args) {
        SpringApplication.run PoketeamBuilderApplication, args
    }
}
