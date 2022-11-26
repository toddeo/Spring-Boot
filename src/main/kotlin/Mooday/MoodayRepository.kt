package Mooday

import org.springframework.data.jpa.repository.JpaRepository

interface MoodayRepository: JpaRepository<Mooday, Long> {
}