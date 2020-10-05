package com.gdipsa.iresas2.model;

import com.gdipsa.iresas2.enums.SVStatus;

import javax.persistence.*;

@Entity
public class SubjectVisit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Subject subject;
    @ManyToOne
    private Visit visit;
    private SVStatus svStatus;

    public SubjectVisit(Subject subject, Visit visit, SVStatus svStatus) {
        this.subject = subject;
        this.visit = visit;
        this.svStatus = svStatus;
    }

    public SubjectVisit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public SVStatus getSvStatus() {
        return svStatus;
    }

    public void setSvStatus(SVStatus svStatus) {
        this.svStatus = svStatus;
    }
}
