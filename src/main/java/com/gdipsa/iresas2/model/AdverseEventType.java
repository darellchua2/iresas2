package com.gdipsa.iresas2.model;

import javax.persistence.*;

@Entity
public class AdverseEventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String adverseEventTypeName;
    @ManyToOne
    private AESeverity aeSeverity;
    private String aeCode;

    public AdverseEventType() {
    }

    public AdverseEventType(String adverseEventTypeName, AESeverity aeSeverity, String aeCode) {
        this.adverseEventTypeName = adverseEventTypeName;
        this.aeSeverity = aeSeverity;
        this.aeCode = aeCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdverseEventTypeName() {
        return adverseEventTypeName;
    }

    public void setAdverseEventTypeName(String adverseEventTypeName) {
        this.adverseEventTypeName = adverseEventTypeName;
    }

    public AESeverity getAeSeverity() {
        return aeSeverity;
    }

    public void setAeSeverity(AESeverity aeSeverity) {
        this.aeSeverity = aeSeverity;
    }

    public String getAeCode() {
        return aeCode;
    }

    public void setAeCode(String aeCode) {
        this.aeCode = aeCode;
    }

}
