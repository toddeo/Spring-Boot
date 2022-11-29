package com.example.Mooday

import org.springframework.stereotype.Service

@Service
class MoodayService(val moodayRepository: MoodayRepository) {

    fun getAllMooday(): List<Mooday>{

    return moodayRepository.findAll()
    }
}