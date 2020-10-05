package com.gdipsa.iresas2.model;

import com.gdipsa.iresas2.enums.VDStatus;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class VisitDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private SubjectVisit subjectVisit;
    @ManyToOne
    private VisitSubType visitSubType;
    private LocalDate actualVisitDate;
    private LocalDate vdCreationDate;
    private VDStatus vdStatus;

    public VisitDetail() {
    }

    public VisitDetail(SubjectVisit subjectVisit, VisitSubType visitSubType, LocalDate actualVisitDate, LocalDate vdCreationDate, VDStatus vdStatus) {
        this.subjectVisit = subjectVisit;
        this.visitSubType = visitSubType;
        this.actualVisitDate = actualVisitDate;
        this.vdCreationDate = vdCreationDate;
        this.vdStatus = vdStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SubjectVisit getSubjectVisit() {
        return subjectVisit;
    }

    public void setSubjectVisit(SubjectVisit subjectVisit) {
        this.subjectVisit = subjectVisit;
    }

    public VisitSubType getVisitSubType() {
        return visitSubType;
    }

    public void setVisitSubType(VisitSubType visitSubType) {
        this.visitSubType = visitSubType;
    }

    public LocalDate getActualVisitDate() {
        return actualVisitDate;
    }

    public void setActualVisitDate(LocalDate actualVisitDate) {
        this.actualVisitDate = actualVisitDate;
    }

    public LocalDate getVdCreationDate() {
        return vdCreationDate;
    }

    public void setVdCreationDate(LocalDate vdCreationDate) {
        this.vdCreationDate = vdCreationDate;
    }

    public VDStatus getVdStatus() {
        return vdStatus;
    }

    public void setVdStatus(VDStatus vdStatus) {
        this.vdStatus = vdStatus;
    }
}
