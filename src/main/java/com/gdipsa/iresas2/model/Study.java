package com.gdipsa.iresas2.model;

import com.gdipsa.iresas2.enums.StudyStatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Study {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String studyName;
    private StudyStatus studyStatus;
    private LocalDate studyStartDate;
    private LocalDate studyEndDate;
    private String studyCode;
//    Quantity of subjects per study
    private String TargetSubjectNo;

    public Study(String studyName, StudyStatus studyStatus, LocalDate studyStartDate, LocalDate studyEndDate, String studyCode, String targetSubjectNo) {
        this.studyName = studyName;
        this.studyStatus = studyStatus;
        this.studyStartDate = studyStartDate;
        this.studyEndDate = studyEndDate;
        this.studyCode = studyCode;
        TargetSubjectNo = targetSubjectNo;
    }

    public Study() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudyName() {
        return studyName;
    }

    public void setStudyName(String studyName) {
        this.studyName = studyName;
    }

    public StudyStatus getStudyStatus() {
        return studyStatus;
    }

    public void setStudyStatus(StudyStatus studyStatus) {
        this.studyStatus = studyStatus;
    }

    public LocalDate getStudyStartDate() {
        return studyStartDate;
    }

    public void setStudyStartDate(LocalDate studyStartDate) {
        this.studyStartDate = studyStartDate;
    }

    public LocalDate getStudyEndDate() {
        return studyEndDate;
    }

    public void setStudyEndDate(LocalDate studyEndDate) {
        this.studyEndDate = studyEndDate;
    }

    public String getStudyCode() {
        return studyCode;
    }

    public void setStudyCode(String studyCode) {
        this.studyCode = studyCode;
    }

    public String getTargetSubjectNo() {
        return TargetSubjectNo;
    }

    public void setTargetSubjectNo(String targetSubjectNo) {
        TargetSubjectNo = targetSubjectNo;
    }
}
