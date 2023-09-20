package org.hackathon.entity;

import java.io.Serializable;
import java.util.Objects;

public class VoterPK implements Serializable {
    private String email;
    private String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VoterPK voterPK = (VoterPK) o;
        return Objects.equals(email, voterPK.email) && Objects.equals(phone, voterPK.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, phone);
    }

}
