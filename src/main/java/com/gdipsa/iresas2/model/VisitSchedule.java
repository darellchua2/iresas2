package com.gdipsa.iresas2.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class VisitSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private VisitDetail visitDetail;
    @ManyToOne
    private User user;

    private LocalDate vsCreationDate;
    private LocalDate vsScheduledDate;

    public VisitSchedule(VisitDetail visitDetail, User user, LocalDate vsCreationDate, LocalDate vsScheduledDate) {
        this.visitDetail = visitDetail;
        this.user = user;
        this.vsCreationDate = vsCreationDate;
        this.vsScheduledDate = vsScheduledDate;
    }

    public VisitSchedule() {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getVsCreationDate() {
        return vsCreationDate;
    }

    public void setVsCreationDate(LocalDate vsCreationDate) {
        this.vsCreationDate = vsCreationDate;
    }

    public LocalDate getVsScheduledDate() {
        return vsScheduledDate;
    }

    public void setVsScheduledDate(LocalDate vsScheduledDate) {
        this.vsScheduledDate = vsScheduledDate;
    }
}
