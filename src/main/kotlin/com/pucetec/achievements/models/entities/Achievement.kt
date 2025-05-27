package com.pucetec.achievements.models.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.GenerationType
import jakarta.persistence.Column
import java.time.LocalDate

@Entity
data class Achievement(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val title: String = "",
    val description: String = "",
    val category: String = "",
    val date: LocalDate = LocalDate.now(),
    @Column(name = "student_name")
    val studentName: String = ""
)