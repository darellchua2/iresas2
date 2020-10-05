package com.gdipsa.iresas2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AESeverity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String aeSeverityName;

    public AESeverity(String aeSeverityName) {
        this.aeSeverityName = aeSeverityName;
    }

    public AESeverity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAeSeverityName() {
        return aeSeverityName;
    }

    public void setAeSeverityName(String aeSeverityName) {
        this.aeSeverityName = aeSeverityName;
    }
}
