package com.blazerg.application.poketeambuilder.domain.repository

import com.blazerg.application.poketeambuilder.domain.entity.Trainer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TrainerRepository extends JpaRepository<Trainer, Long> {

    /**
     * @param trainer's name
     * @return trainer info
     */
    List<Trainer> findByName(String name)
}