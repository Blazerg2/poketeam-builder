package com.blazerg.application.poketeambuilder.controller

import com.blazerg.application.poketeambuilder.domain.repository.PokemonRepository
import com.blazerg.application.poketeambuilder.service.PokemonService
import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Api(value = 'Pokemon team', description = 'The pokemon builder API for the virtual league')
@RestController
@RequestMapping(value = "/poketeam")
class PokemonController {

    @Autowired
    private PokemonService pokemonService

    @Autowired
    private PokemonRepository pokemonRepository

}
