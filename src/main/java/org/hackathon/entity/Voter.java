package org.hackathon.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Voter")
public class Voter implements Serializable {
    @Id
    @Column(name = "identity", unique = true)
    private String identity;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "zipCode")
    private String zipCode;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "homeAddress")
    private String homeAddress;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "dateOfBirth")
    private String dateOfBirth;
    @Column(name = "phone")
    private String phone;
    @Column(name = "phoneType")
    private String phoneType;

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public Voter() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Voter{");
        sb.append("identity='").append(identity).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", zipCode='").append(zipCode).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", homeAddress='").append(homeAddress).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", dateOfBirth='").append(dateOfBirth).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", phoneType='").append(phoneType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
