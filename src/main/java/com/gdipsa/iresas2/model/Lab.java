package com.gdipsa.iresas2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String labName;
    private String labContact;
    private String labCode;

    public Lab(String labName, String labContact, String labCode) {
        this.labName = labName;
        this.labContact = labContact;
        this.labCode = labCode;
    }

    public Lab() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLabContact() {
        return labContact;
    }

    public void setLabContact(String labContact) {
        this.labContact = labContact;
    }

    public String getLabCode() {
        return labCode;
    }

    public void setLabCode(String labCode) {
        this.labCode = labCode;
    }
}
