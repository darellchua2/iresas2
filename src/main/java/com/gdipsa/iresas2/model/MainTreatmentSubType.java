package com.gdipsa.iresas2.model;

import javax.persistence.*;

@Entity
public class MainTreatmentSubType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private MainTreatmentType mainTreatmentType;
    private String mainTreatmentSubTypeName;
    private String mainTreatmentSubTypeCode;

    public MainTreatmentSubType(MainTreatmentType mainTreatmentType, String mainTreatmentSubTypeName, String mainTreatmentSubTypeCode) {
        this.mainTreatmentType = mainTreatmentType;
        this.mainTreatmentSubTypeName = mainTreatmentSubTypeName;
        this.mainTreatmentSubTypeCode = mainTreatmentSubTypeCode;
    }

    public MainTreatmentSubType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MainTreatmentType getMainTreatmentType() {
        return mainTreatmentType;
    }

    public void setMainTreatmentType(MainTreatmentType mainTreatmentType) {
        this.mainTreatmentType = mainTreatmentType;
    }

    public String getMainTreatmentSubTypeName() {
        return mainTreatmentSubTypeName;
    }

    public void setMainTreatmentSubTypeName(String mainTreatmentSubTypeName) {
        this.mainTreatmentSubTypeName = mainTreatmentSubTypeName;
    }

    public String getMainTreatmentSubTypeCode() {
        return mainTreatmentSubTypeCode;
    }

    public void setMainTreatmentSubTypeCode(String mainTreatmentSubTypeCode) {
        this.mainTreatmentSubTypeCode = mainTreatmentSubTypeCode;
    }
}
