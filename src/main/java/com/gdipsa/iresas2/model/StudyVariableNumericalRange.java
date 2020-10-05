package com.gdipsa.iresas2.model;

import javax.persistence.*;

@Entity
public class StudyVariableNumericalRange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private StudyVariable studyVariable;
    private Float startRange;
    private Float endRange;

    public StudyVariableNumericalRange(StudyVariable studyVariable, Float startRange, Float endRange) {
        this.studyVariable = studyVariable;
        this.startRange = startRange;
        this.endRange = endRange;
    }

    public StudyVariableNumericalRange() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StudyVariable getStudyVariable() {
        return studyVariable;
    }

    public void setStudyVariable(StudyVariable studyVariable) {
        this.studyVariable = studyVariable;
    }

    public Float getStartRange() {
        return startRange;
    }

    public void setStartRange(Float startRange) {
        this.startRange = startRange;
    }

    public Float getEndRange() {
        return endRange;
    }

    public void setEndRange(Float endRange) {
        this.endRange = endRange;
    }
}
