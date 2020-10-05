package com.gdipsa.iresas2.model;

import javax.persistence.*;

@Entity
public class StudySubType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Study study;
    private String studySubTypeName;
    private String studySubTypeCode;

    public StudySubType(Study study, String studySubTypeName, String studySubTypeCode) {
        this.study = study;
        this.studySubTypeName = studySubTypeName;
        this.studySubTypeCode = studySubTypeCode;
    }

    public StudySubType() {
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

    public String getStudySubTypeName() {
        return studySubTypeName;
    }

    public void setStudySubTypeName(String studySubTypeName) {
        this.studySubTypeName = studySubTypeName;
    }

    public String getStudySubTypeCode() {
        return studySubTypeCode;
    }

    public void setStudySubTypeCode(String studySubTypeCode) {
        this.studySubTypeCode = studySubTypeCode;
    }
}
