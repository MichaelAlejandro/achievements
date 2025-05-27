package com.pucetec.achievements.controllers

import com.pucetec.achievements.models.entities.Achievement
import com.pucetec.achievements.service.AchievementService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/api/achievements")
class AchievementController(
    private val service: AchievementService
) {
    @GetMapping
    fun findAll(): List<Achievement> = service.findAll()

    @PostMapping
    fun save(@RequestBody achievement: Achievement): Achievement = service.save(achievement)
}