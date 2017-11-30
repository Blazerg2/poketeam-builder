package com.blazerg.application.poketeambuilder.domain.repository

import com.blazerg.application.poketeambuilder.domain.entity.Trainer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TrainerRepository extends JpaRepository<Trainer, Long> {


}