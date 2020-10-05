package com.gdipsa.iresas2.model;

import javax.persistence.*;

@Entity
public class StudyPI {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Study study;
    @ManyToOne
    private User user;

    public StudyPI(Study study, User user) {
        this.study = study;
        this.user = user;
    }

    public StudyPI() {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
