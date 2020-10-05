package com.gdipsa.iresas2.model;

import javax.persistence.*;

@Entity
public class SubjectStudySubType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Subject subject;
    @ManyToOne
    private StudySubType studySubType;

    public SubjectStudySubType() {
    }

    public SubjectStudySubType(Subject subject, StudySubType studySubType) {
        this.subject = subject;
        this.studySubType = studySubType;
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

    public StudySubType getStudySubType() {
        return studySubType;
    }

    public void setStudySubType(StudySubType studySubType) {
        this.studySubType = studySubType;
    }
}
