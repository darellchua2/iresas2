package com.gdipsa.iresas2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VariableType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String variableTypeName;
    private String variableTypeCode;

    public VariableType(String variableTypeName, String variableTypeCode) {
        this.variableTypeName = variableTypeName;
        this.variableTypeCode = variableTypeCode;
    }

    public VariableType() {
    }

    public String getVariableTypeCode() {
        return variableTypeCode;
    }

    public void setVariableTypeCode(String variableTypeCode) {
        this.variableTypeCode = variableTypeCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVariableTypeName() {
        return variableTypeName;
    }

    public void setVariableTypeName(String variableTypeName) {
        this.variableTypeName = variableTypeName;
    }
}
