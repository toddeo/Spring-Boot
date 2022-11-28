package com.example.Mooday

import org.springframework.stereotype.Service

@Service
class MoodayService {

    fun getAllMooday(): List<Mooday>{

    return listOf(
    Mooday(1, "Girard", "Antoine"),
    Mooday(2, "Dupont", "Pierre"),
    Mooday(3, "Lebeau", "Dylan"),
    )
    }
}