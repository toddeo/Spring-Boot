package com.example.Mooday

import javax.persistence.*


@Entity
@Table
data class Cars(

    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    val id: Long,
    val nom: String,
    val prenom: String,
    val age: Int
)
