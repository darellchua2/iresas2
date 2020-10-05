package com.gdipsa.iresas2.model;

import javax.persistence.*;

@Entity
public class Sample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sampleName;
    private int sampleMeasure;
    @ManyToOne
    private Unit unit;

    public Sample(String sampleName, int sampleMeasure, Unit unit) {
        this.sampleName = sampleName;
        this.sampleMeasure = sampleMeasure;
        this.unit = unit;
    }

    public Sample() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public int getSampleMeasure() {
        return sampleMeasure;
    }

    public void setSampleMeasure(int sampleMeasure) {
        this.sampleMeasure = sampleMeasure;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
