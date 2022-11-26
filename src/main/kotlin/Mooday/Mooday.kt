package Mooday

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table
data class Mooday(

    @Id
    val id: Long,
    val nom: String,
    val prenom: String
)
