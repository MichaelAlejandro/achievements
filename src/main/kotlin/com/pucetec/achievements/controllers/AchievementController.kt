package com.pucetec.achievements.controllers

import com.pucetec.achievements.models.entities.Achievement
import com.pucetec.achievements.service.AchievementService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/achievements")
class AchievementController(private val service: AchievementService) {

    @GetMapping
    fun getAll(): List<Achievement> = service.findAll()

    @PostMapping
    fun create(@RequestBody achievement: Achievement): Achievement = service.save(achievement)
}