package com.gdipsa.iresas2.model;

import javax.persistence.*;

@Entity
public class StudyVariableCategorical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private StudyVariable studyVariable;
    private String categoryName;

    public StudyVariableCategorical(StudyVariable studyVariable, String categoryName) {
        this.studyVariable = studyVariable;
        this.categoryName = categoryName;
    }

    public StudyVariableCategorical() {
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
