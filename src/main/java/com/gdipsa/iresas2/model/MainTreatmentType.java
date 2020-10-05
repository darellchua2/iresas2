package com.gdipsa.iresas2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MainTreatmentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mainTreatmentType;
    private String mainTreatmentCode;

    public MainTreatmentType(String mainTreatmentType, String mainTreatmentCode) {
        this.mainTreatmentType = mainTreatmentType;
        this.mainTreatmentCode = mainTreatmentCode;
    }

    public MainTreatmentType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMainTreatmentType() {
        return mainTreatmentType;
    }

    public void setMainTreatmentType(String mainTreatmentType) {
        this.mainTreatmentType = mainTreatmentType;
    }

    public String getMainTreatmentCode() {
        return mainTreatmentCode;
    }

    public void setMainTreatmentCode(String mainTreatmentCode) {
        this.mainTreatmentCode = mainTreatmentCode;
    }
}
