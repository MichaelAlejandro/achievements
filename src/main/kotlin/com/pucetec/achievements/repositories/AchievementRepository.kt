package com.pucetec.achievements.repositories

import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository
import com.pucetec.achievements.models.entities.Achievement

@Repository
interface AchievementRepository : JpaRepository<Achievement, Long>
