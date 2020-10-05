package com.gdipsa.iresas2.model;

import javax.persistence.*;

@Entity
public class LabStudyVariableMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Lab lab;
    @ManyToOne
    private StudyVariable studyVariable;
    private String labVariableName;

    public LabStudyVariableMapping(Lab lab, StudyVariable studyVariable, String labVariableName) {
        this.lab = lab;
        this.studyVariable = studyVariable;
        this.labVariableName = labVariableName;
    }

    public LabStudyVariableMapping() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lab getLab() {
        return lab;
    }

    public void setLab(Lab lab) {
        this.lab = lab;
    }

    public StudyVariable getStudyVariable() {
        return studyVariable;
    }

    public void setStudyVariable(StudyVariable studyVariable) {
        this.studyVariable = studyVariable;
    }

    public String getLabVariableName() {
        return labVariableName;
    }

    public void setLabVariableName(String labVariableName) {
        this.labVariableName = labVariableName;
    }
}
