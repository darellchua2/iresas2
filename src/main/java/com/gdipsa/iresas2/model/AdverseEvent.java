package com.gdipsa.iresas2.model;

import com.gdipsa.iresas2.enums.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class AdverseEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Subject subject;
    @ManyToOne
    private Visit visit;
    private LocalDate aeCreateDate;
    private LocalDate aeStartDate;
    private LocalDate aeEndDate;
    private AEStatus aeStatus;
    private String aeDescription;
    private AEOutcomeStatus aeOutcomeStatus;
    private RelationshipToStudyTreatment relationshipToStudyTreatment;
    private ActionTaken actionTaken;
    private String contaminationRemarksGiven;
    private ContaminationMedGiven contaminationMedGiven;
    private Expectedness expectedness;

    public AdverseEvent() {
    }

    public AdverseEvent(Subject subject, Visit visit, LocalDate aeCreateDate, LocalDate aeStartDate, LocalDate aeEndDate, AEStatus aeStatus, String aeDescription, AEOutcomeStatus aeOutcomeStatus, RelationshipToStudyTreatment relationshipToStudyTreatment, ActionTaken actionTaken, String contaminationRemarksGiven, ContaminationMedGiven contaminationMedGiven, Expectedness expectedness) {
        this.subject = subject;
        this.visit = visit;
        this.aeCreateDate = aeCreateDate;
        this.aeStartDate = aeStartDate;
        this.aeEndDate = aeEndDate;
        this.aeStatus = aeStatus;
        this.aeDescription = aeDescription;
        this.aeOutcomeStatus = aeOutcomeStatus;
        this.relationshipToStudyTreatment = relationshipToStudyTreatment;
        this.actionTaken = actionTaken;
        this.contaminationRemarksGiven = contaminationRemarksGiven;
        this.contaminationMedGiven = contaminationMedGiven;
        this.expectedness = expectedness;
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

    public LocalDate getAeCreateDate() {
        return aeCreateDate;
    }

    public void setAeCreateDate(LocalDate aeCreateDate) {
        this.aeCreateDate = aeCreateDate;
    }

    public LocalDate getAeStartDate() {
        return aeStartDate;
    }

    public void setAeStartDate(LocalDate aeStartDate) {
        this.aeStartDate = aeStartDate;
    }

    public LocalDate getAeEndDate() {
        return aeEndDate;
    }

    public void setAeEndDate(LocalDate aeEndDate) {
        this.aeEndDate = aeEndDate;
    }

    public AEStatus getAeStatus() {
        return aeStatus;
    }

    public void setAeStatus(AEStatus aeStatus) {
        this.aeStatus = aeStatus;
    }

    public String getAeDescription() {
        return aeDescription;
    }

    public void setAeDescription(String aeDescription) {
        this.aeDescription = aeDescription;
    }

    public AEOutcomeStatus getAeOutcomeStatus() {
        return aeOutcomeStatus;
    }

    public void setAeOutcomeStatus(AEOutcomeStatus aeOutcomeStatus) {
        this.aeOutcomeStatus = aeOutcomeStatus;
    }

    public RelationshipToStudyTreatment getRelationshipToStudyTreatment() {
        return relationshipToStudyTreatment;
    }

    public void setRelationshipToStudyTreatment(RelationshipToStudyTreatment relationshipToStudyTreatment) {
        this.relationshipToStudyTreatment = relationshipToStudyTreatment;
    }

    public ActionTaken getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(ActionTaken actionTaken) {
        this.actionTaken = actionTaken;
    }

    public String getContaminationRemarksGiven() {
        return contaminationRemarksGiven;
    }

    public void setContaminationRemarksGiven(String contaminationRemarksGiven) {
        this.contaminationRemarksGiven = contaminationRemarksGiven;
    }

    public ContaminationMedGiven getContaminationMedGiven() {
        return contaminationMedGiven;
    }

    public void setContaminationMedGiven(ContaminationMedGiven contaminationMedGiven) {
        this.contaminationMedGiven = contaminationMedGiven;
    }

    public Expectedness getExpectedness() {
        return expectedness;
    }

    public void setExpectedness(Expectedness expectedness) {
        this.expectedness = expectedness;
    }
}
