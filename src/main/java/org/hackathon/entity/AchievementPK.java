package org.hackathon.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

public class AchievementPK implements Serializable {
    private String email;
    private String achievementName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAchievementName() {
        return achievementName;
    }

    public void setAchievementName(String achievementName) {
        this.achievementName = achievementName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AchievementPK that = (AchievementPK) o;
        return Objects.equals(email, that.email) && Objects.equals(achievementName, that.achievementName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, achievementName);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AchievementPK{");
        sb.append("email='").append(email).append('\'');
        sb.append(", achievementName='").append(achievementName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
