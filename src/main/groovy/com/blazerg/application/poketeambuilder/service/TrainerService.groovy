package com.blazerg.application.poketeambuilder.service

import com.blazerg.application.poketeambuilder.domain.repository.TrainerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TrainerService {

    @Autowired
    TrainerRepository trainerRepository
}
