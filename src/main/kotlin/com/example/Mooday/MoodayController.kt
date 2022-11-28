package com.example.Mooday

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1")
class MoodayController(val moodayService: MoodayService) {

    @GetMapping( "/moodays")
    fun getMooday(): List<Mooday> {
        return moodayService.getAllMooday()
    }

}