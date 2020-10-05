package com.gdipsa.iresas2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VisitType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String visitTypeName;
    private String visitTypeCode;

    public VisitType(String visitTypeName, String visitTypeCode) {
        this.visitTypeName = visitTypeName;
        this.visitTypeCode = visitTypeCode;
    }

    public VisitType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVisitTypeName() {
        return visitTypeName;
    }

    public void setVisitTypeName(String visitTypeName) {
        this.visitTypeName = visitTypeName;
    }

    public String getVisitTypeCode() {
        return visitTypeCode;
    }

    public void setVisitTypeCode(String visitTypeCode) {
        this.visitTypeCode = visitTypeCode;
    }
}
