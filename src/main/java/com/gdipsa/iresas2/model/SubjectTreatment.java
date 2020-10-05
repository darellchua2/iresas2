package com.gdipsa.iresas2.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class SubjectTreatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Subject subject;
    @ManyToOne
    private MainTreatmentSubType mainTreatmentSubType;
    private LocalDate treatmentStartDate;
    private LocalDate treatmentEndDate;

    public SubjectTreatment() {
    }

    public SubjectTreatment(Subject subject, MainTreatmentSubType mainTreatmentSubType, LocalDate treatmentStartDate, LocalDate treatmentEndDate) {
        this.subject = subject;
        this.mainTreatmentSubType = mainTreatmentSubType;
        this.treatmentStartDate = treatmentStartDate;
        this.treatmentEndDate = treatmentEndDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public MainTreatmentSubType getMainTreatmentSubType() {
        return mainTreatmentSubType;
    }

    public void setMainTreatmentSubType(MainTreatmentSubType mainTreatmentSubType) {
        this.mainTreatmentSubType = mainTreatmentSubType;
    }

    public LocalDate getTreatmentStartDate() {
        return treatmentStartDate;
    }

    public void setTreatmentStartDate(LocalDate treatmentStartDate) {
        this.treatmentStartDate = treatmentStartDate;
    }

    public LocalDate getTreatmentEndDate() {
        return treatmentEndDate;
    }

    public void setTreatmentEndDate(LocalDate treatmentEndDate) {
        this.treatmentEndDate = treatmentEndDate;
    }
}
