package com.gdipsa.iresas2.model;

import com.gdipsa.iresas2.enums.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String subjectCode;
    @ManyToOne
    private StudySite studySite;
    private SubjectStatus subjectStatus;
    private LocalDate dateOfBirth;
    private Gender gender;
    @ManyToOne
    private Race race;
    private LocalDate studySubjectStartDate;
    private LocalDate studySubjectEndDate;
    private String SubjectEligibilityComment;

    public Subject() {
    }

    public Subject(String subjectCode, StudySite studySite, SubjectStatus subjectStatus, LocalDate dateOfBirth, Gender gender, Race race, LocalDate studySubjectStartDate, LocalDate studySubjectEndDate, String subjectEligibilityComment) {
        this.subjectCode = subjectCode;
        this.studySite = studySite;
        this.subjectStatus = subjectStatus;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.race = race;
        this.studySubjectStartDate = studySubjectStartDate;
        this.studySubjectEndDate = studySubjectEndDate;
        SubjectEligibilityComment = subjectEligibilityComment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public StudySite getStudySite() {
        return studySite;
    }

    public void setStudySite(StudySite studySite) {
        this.studySite = studySite;
    }

    public SubjectStatus getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(SubjectStatus subjectStatus) {
        this.subjectStatus = subjectStatus;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public LocalDate getStudySubjectStartDate() {
        return studySubjectStartDate;
    }

    public void setStudySubjectStartDate(LocalDate studySubjectStartDate) {
        this.studySubjectStartDate = studySubjectStartDate;
    }

    public LocalDate getStudySubjectEndDate() {
        return studySubjectEndDate;
    }

    public void setStudySubjectEndDate(LocalDate studySubjectEndDate) {
        this.studySubjectEndDate = studySubjectEndDate;
    }

    public String getSubjectEligibilityComment() {
        return SubjectEligibilityComment;
    }

    public void setSubjectEligibilityComment(String subjectEligibilityComment) {
        SubjectEligibilityComment = subjectEligibilityComment;
    }
}
