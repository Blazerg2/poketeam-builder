package com.blazerg.application.poketeambuilder.controller

import com.blazerg.application.poketeambuilder.domain.entity.Trainer
import com.blazerg.application.poketeambuilder.domain.repository.TrainerRepository
import com.blazerg.application.poketeambuilder.model.TrainerDto
import com.blazerg.application.poketeambuilder.service.TrainerService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@Api(value = 'trainers', description = 'The pokemon builder API for the virtual league')
@RestController
class TrainerController {

    @Autowired
    private TrainerService trainerService

    @Autowired
    private TrainerRepository trainerRepository


    @ApiOperation(
            notes = 'Method that get you a trainer list.',
            response = TrainerDto,
            tags = ['Trainer List'],
            value = 'Find the list of trainers'
    )

    @ApiResponses(value = [
            @ApiResponse(code = 200, message = 'Successful operation'),
            @ApiResponse(code = 400, message = 'Bad Request'),
            @ApiResponse(code = 404, message = 'Not Found'),
            @ApiResponse(code = 500, message = 'Server error')
    ])
    @GetMapping(value = "/trainers", produces = " application/json")
    @ResponseBody
    List<TrainerDto> getTrainers() {
        List<TrainerDto> response = new ArrayList<TrainerDto>()
        for (Trainer temp : this.trainerRepository.findAll()) {
            response.add(new TrainerDto(name: temp?.name))
        }

        response
    }

    @ApiOperation(
            notes = 'Method that creates a new trainer.',
            tags = ['Trainer creation'],
            value = 'Create a new trainer'
    )

    @ApiResponses(value = [
            @ApiResponse(code = 200, message = 'Successful operation'),
            @ApiResponse(code = 500, message = 'Server error')
    ])
    @PostMapping(value = "/trainers", produces = " application/json")
    @ResponseBody
    void addTrainer(@RequestBody TrainerDto trainerRequest) {
        Trainer result = this.trainerRepository.save(new Trainer(name: trainerRequest?.name))
    }

    @ApiOperation(
            notes = 'Method that get you a trainer by his or her name.',
            response = TrainerDto,
            tags = ['Trainers by name'],
            value = 'Find the name for the inputs name'
    )

    @ApiResponses(value = [
            @ApiResponse(code = 200, message = 'Successful operation'),
            @ApiResponse(code = 400, message = 'Bad Request'),
            @ApiResponse(code = 404, message = 'Not Found'),
            @ApiResponse(code = 500, message = 'Server error')
    ])
    @GetMapping(value = "/trainers/{name}", produces = " application/json")
    @ResponseBody
    List<Trainer> getTrainersByName(@PathVariable String name) {
        this.trainerRepository.findByName(name)
    }

    @ApiOperation(
            notes = 'Method that delete an user.',
            response = TrainerDto,
            tags = ['Delete Trainer'],
            value = 'Delete selected trainer'
    )

    @ApiResponses(value = [
            @ApiResponse(code = 200, message = 'Successful operation'),
            @ApiResponse(code = 400, message = 'Bad Request'),
            @ApiResponse(code = 404, message = 'Not Found'),
            @ApiResponse(code = 500, message = 'Server error')
    ])
    @DeleteMapping(value = "/trainers/{trainerId}", produces = " application/json")
    @ResponseBody
    void deleteTrainer(@PathVariable Long trainerId) {
        this.trainerRepository.delete(trainerId)
    }
}
