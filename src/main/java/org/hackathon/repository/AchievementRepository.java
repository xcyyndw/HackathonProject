package org.hackathon.repository;

import org.hackathon.entity.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AchievementRepository extends JpaRepository<Achievement, String> {
    List<Achievement> findByEmail(String email);

    Achievement findByEmailAndAchievementName(String email, String achievement);
}
