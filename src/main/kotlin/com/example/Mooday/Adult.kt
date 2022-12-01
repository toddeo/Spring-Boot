package com.example.Mooday

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table
data class Adult(

    @Id
    val id: Long,
    val lastName: String,
    val firstName: String,
    val image: String,
    val emotion: String
)