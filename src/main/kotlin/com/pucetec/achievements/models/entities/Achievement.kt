package com.pucetec.achievements.models.entities

import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class Achievement(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val title: String,
    val description: String,
    val category: String,
    val date: LocalDate,

    @Column(name = "student_name")
    val studentName: String
)