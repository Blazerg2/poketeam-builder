package com.blazerg.application.poketeambuilder.controller

import com.blazerg.application.poketeambuilder.domain.repository.TrainerRepository
import com.blazerg.application.poketeambuilder.service.TrainerService
import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Api(value = 'trainer', description = 'The pokemon builder API for the virtual league')
@RestController
@RequestMapping(value = "/poketeam")
class TrainerController {

    @Autowired
    private TrainerService trainerService

    @Autowired
    private TrainerRepository trainerRepository

}
