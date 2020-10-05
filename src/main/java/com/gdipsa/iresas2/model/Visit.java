package com.gdipsa.iresas2.model;

import javax.persistence.*;

@Entity
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne VisitType visitType;
    private String visitName;
    private String visitCode;

    public Visit() {
    }

    public Visit(VisitType visitType, String visitName, String visitCode) {
        this.visitType = visitType;
        this.visitName = visitName;
        this.visitCode = visitCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VisitType getVisitType() {
        return visitType;
    }

    public void setVisitType(VisitType visitType) {
        this.visitType = visitType;
    }

    public String getVisitName() {
        return visitName;
    }

    public void setVisitName(String visitName) {
        this.visitName = visitName;
    }

    public String getVisitCode() {
        return visitCode;
    }

    public void setVisitCode(String visitCode) {
        this.visitCode = visitCode;
    }
}
