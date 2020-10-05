package com.gdipsa.iresas2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VisitSubType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String visitSubTypeName;
    private String visitSubTypeCode;

    public VisitSubType(String visitSubTypeName, String visitSubTypeCode) {
        this.visitSubTypeName = visitSubTypeName;
        this.visitSubTypeCode = visitSubTypeCode;
    }

    public VisitSubType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVisitSubTypeName() {
        return visitSubTypeName;
    }

    public void setVisitSubTypeName(String visitSubTypeName) {
        this.visitSubTypeName = visitSubTypeName;
    }

    public String getVisitSubTypeCode() {
        return visitSubTypeCode;
    }

    public void setVisitSubTypeCode(String visitSubTypeCode) {
        this.visitSubTypeCode = visitSubTypeCode;
    }
}
