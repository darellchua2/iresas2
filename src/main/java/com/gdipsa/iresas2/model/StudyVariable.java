package com.gdipsa.iresas2.model;

import com.gdipsa.iresas2.enums.StudyVariableStatus;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class StudyVariable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Study study;
    @ManyToOne
    private Variable variable;
    @ManyToOne
    private VariableType variableType;
    private LocalDate creationDateTime;
    private StudyVariableStatus studyVariableStatus;

    public StudyVariable() {
    }

    public StudyVariable(Study study, Variable variable, VariableType variableType, LocalDate creationDateTime, StudyVariableStatus studyVariableStatus) {
        this.study = study;
        this.variable = variable;
        this.variableType = variableType;
        this.creationDateTime = creationDateTime;
        this.studyVariableStatus = studyVariableStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public VariableType getVariableType() {
        return variableType;
    }

    public void setVariableType(VariableType variableType) {
        this.variableType = variableType;
    }

    public LocalDate getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDate creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public StudyVariableStatus getStudyVariableStatus() {
        return studyVariableStatus;
    }

    public void setStudyVariableStatus(StudyVariableStatus studyVariableStatus) {
        this.studyVariableStatus = studyVariableStatus;
    }
}
