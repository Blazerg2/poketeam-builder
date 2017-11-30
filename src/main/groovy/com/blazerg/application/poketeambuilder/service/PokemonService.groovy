package com.blazerg.application.poketeambuilder.service

import com.blazerg.application.poketeambuilder.domain.repository.PokemonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository

}
