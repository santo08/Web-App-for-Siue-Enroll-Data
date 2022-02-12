package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SchemaModel {

    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "Lname")
    private String lastName;
    @Column(name = "Fname")
    private String firstName;
    @Column(name = "Term")
    private int appliedTerm;
    @Column(name = "Level")
    private String gradLevel;
    @Column(name = "Admit_Term")
    private int admitTerm;
    @Column(name = "Email")
    private String email;
    @Column(name = "Enrl_Status_Date")
    private String dateEnrolled;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAppliedTerm() {
        return appliedTerm;
    }

    public void setAppliedTerm(int appliedTerm) {
        this.appliedTerm = appliedTerm;
    }

    public String getGradLevel() {
        return gradLevel;
    }

    public void setGradLevel(String gradLevel) {
        this.gradLevel = gradLevel;
    }

    public int getAdmitTerm() {
        return admitTerm;
    }

    public void setAdmitTerm(int admitTerm) {
        this.admitTerm = admitTerm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(String dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }
}
