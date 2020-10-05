package com.gdipsa.iresas2.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class VisitDetailStudyVariable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private VisitDetail visitDetail;
    @ManyToOne
    private StudyVariable studyVariable;
    private float visitDetailResponse;
    private float visitDetailNumerical;
    private LocalDate visitDetailDateTime;
    private String visitDetailComment;

    public VisitDetailStudyVariable(VisitDetail visitDetail, StudyVariable studyVariable, float visitDetailResponse, float visitDetailNumerical, LocalDate visitDetailDateTime, String visitDetailComment) {
        this.visitDetail = visitDetail;
        this.studyVariable = studyVariable;
        this.visitDetailResponse = visitDetailResponse;
        this.visitDetailNumerical = visitDetailNumerical;
        this.visitDetailDateTime = visitDetailDateTime;
        this.visitDetailComment = visitDetailComment;
    }

    public VisitDetailStudyVariable() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VisitDetail getVisitDetail() {
        return visitDetail;
    }

    public void setVisitDetail(VisitDetail visitDetail) {
        this.visitDetail = visitDetail;
    }

    public StudyVariable getStudyVariable() {
        return studyVariable;
    }

    public void setStudyVariable(StudyVariable studyVariable) {
        this.studyVariable = studyVariable;
    }

    public float getVisitDetailResponse() {
        return visitDetailResponse;
    }

    public void setVisitDetailResponse(float visitDetailResponse) {
        this.visitDetailResponse = visitDetailResponse;
    }

    public float getVisitDetailNumerical() {
        return visitDetailNumerical;
    }

    public void setVisitDetailNumerical(float visitDetailNumerical) {
        this.visitDetailNumerical = visitDetailNumerical;
    }

    public LocalDate getVisitDetailDateTime() {
        return visitDetailDateTime;
    }

    public void setVisitDetailDateTime(LocalDate visitDetailDateTime) {
        this.visitDetailDateTime = visitDetailDateTime;
    }

    public String getVisitDetailComment() {
        return visitDetailComment;
    }

    public void setVisitDetailComment(String visitDetailComment) {
        this.visitDetailComment = visitDetailComment;
    }
}
