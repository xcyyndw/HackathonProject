package org.hackathon.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Achievement")
public class Achievement implements Serializable {
    @Id
    @JsonIgnore
    private Long id;
    private String achievementName;
    private String unlock;
    private String unlockDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAchievementName() {
        return achievementName;
    }

    public void setAchievementName(String achievementName) {
        this.achievementName = achievementName;
    }

    public String getUnlock() {
        return unlock;
    }

    public void setUnlock(String unlock) {
        this.unlock = unlock;
    }

    public String getUnlockDate() {
        return unlockDate;
    }

    public void setUnlockDate(String unlockDate) {
        this.unlockDate = unlockDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Achievement{");
        sb.append("id=").append(id);
        sb.append(", achievementName='").append(achievementName).append('\'');
        sb.append(", unlock='").append(unlock).append('\'');
        sb.append(", unlockDate='").append(unlockDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
