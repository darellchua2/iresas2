package com.gdipsa.iresas2.model;

import javax.persistence.*;

@Entity
public class SubjectVisitSample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private SubjectVisit subjectVisit;
    @ManyToOne
    private Sample sample;
    private float sampleQuantity;

    public SubjectVisitSample() {
    }

    public SubjectVisitSample(SubjectVisit subjectVisit, Sample sample, float sampleQuantity) {
        this.subjectVisit = subjectVisit;
        this.sample = sample;
        this.sampleQuantity = sampleQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SubjectVisit getSubjectVisit() {
        return subjectVisit;
    }

    public void setSubjectVisit(SubjectVisit subjectVisit) {
        this.subjectVisit = subjectVisit;
    }

    public Sample getSample() {
        return sample;
    }

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    public float getSampleQuantity() {
        return sampleQuantity;
    }

    public void setSampleQuantity(float sampleQuantity) {
        this.sampleQuantity = sampleQuantity;
    }
}
