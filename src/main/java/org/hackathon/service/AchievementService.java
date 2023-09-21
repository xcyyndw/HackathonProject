package org.hackathon.service;

import org.hackathon.entity.Achievement;

import java.util.List;

public interface AchievementService {
    List<Achievement> findByEmail(String email);

    Achievement save(Achievement achievement);
}
