package com.zay.fithub.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "/users")
@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;
    private String firstName;
    private String name;
    private Date birthDate;
    private String nationality;


    public User() {
    }


    public User(String id, String firstName, String name, Date birthDate, String nationality) {
        this.id = id;
        this.firstName = firstName;
        this.name = name;
        this.birthDate = birthDate;
        this.nationality = nationality;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", name='" + getName() + "'" +
            ", birthDate='" + getBirthDate() + "'" +
            ", nationality='" + getNationality() + "'" +
            "}";
    }

}