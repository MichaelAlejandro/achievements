package com.pucetec.achievements.repositories

import com.pucetec.achievements.models.entities.Achievement
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AchievementRepository : JpaRepository<Achievement, Long>