package com.example.Mooday

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table
data class Adult(

    @Id
    val id_family: Long,
    val Name: String,
)