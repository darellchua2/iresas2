package com.gdipsa.iresas2.model;

import javax.persistence.*;

@Entity
public class StudySite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Study study;
    @ManyToOne
    private Site site;

    public StudySite(Study study, Site site) {
        this.study = study;
        this.site = site;
    }

    public StudySite() {
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

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }
}
