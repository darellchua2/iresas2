package com.gdipsa.iresas2.model;

import javax.persistence.*;

@Entity
public class StudyVariableOther {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private StudyVariable studyVariable;
    @ManyToOne
    private SubCategory subCategory;
    private float startRange;
    private float endRange;

    public StudyVariableOther(StudyVariable studyVariable, SubCategory subCategory, float startRange, float endRange) {
        this.studyVariable = studyVariable;
        this.subCategory = subCategory;
        this.startRange = startRange;
        this.endRange = endRange;
    }

    public StudyVariableOther() {
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

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public float getStartRange() {
        return startRange;
    }

    public void setStartRange(float startRange) {
        this.startRange = startRange;
    }

    public float getEndRange() {
        return endRange;
    }

    public void setEndRange(float endRange) {
        this.endRange = endRange;
    }
}
