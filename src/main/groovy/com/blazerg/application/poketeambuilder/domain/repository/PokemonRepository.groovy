package com.blazerg.application.poketeambuilder.domain.repository

import com.blazerg.application.poketeambuilder.domain.entity.Pokemon
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PokemonRepository extends JpaRepository<Pokemon, Long>{

}