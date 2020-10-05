package com.gdipsa.iresas2.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class SubjectVisitSampleTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private SubjectVisitSample subjectVisitSample;
    private float transactionQuantity;
    private LocalDate transactionDate;

    public SubjectVisitSampleTransaction(SubjectVisitSample subjectVisitSample, float transactionQuantity, LocalDate transactionDate) {
        this.subjectVisitSample = subjectVisitSample;
        this.transactionQuantity = transactionQuantity;
        this.transactionDate = transactionDate;
    }

    public SubjectVisitSampleTransaction() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SubjectVisitSample getSubjectVisitSample() {
        return subjectVisitSample;
    }

    public void setSubjectVisitSample(SubjectVisitSample subjectVisitSample) {
        this.subjectVisitSample = subjectVisitSample;
    }

    public float getTransactionQuantity() {
        return transactionQuantity;
    }

    public void setTransactionQuantity(float transactionQuantity) {
        this.transactionQuantity = transactionQuantity;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }
}
