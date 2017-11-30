package com.blazerg.application.poketeambuilder.model

import com.blazerg.application.poketeambuilder.domain.entity.Pokemon
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import groovy.transform.Canonical

@Canonical
@JsonIgnoreProperties(ignoreUnknown = true)
class TrainerDto {

    String name

    ArrayList<Pokemon> pokeTeam
}
