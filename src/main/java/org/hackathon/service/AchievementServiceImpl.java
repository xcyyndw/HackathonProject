package org.hackathon.service;

import org.hackathon.entity.Achievement;
import org.hackathon.repository.AchievementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchievementServiceImpl implements AchievementService {

    @Autowired
    private AchievementRepository achievementRepository;

    @Override
    public List<Achievement> findByEmail(String email) {
        return achievementRepository.findByEmail(email);
    }

    @Override
    public Achievement save(Achievement achievement) {
        return achievementRepository.save(achievement);
    }
}
