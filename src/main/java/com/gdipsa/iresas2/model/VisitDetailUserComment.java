package com.gdipsa.iresas2.model;

import javax.persistence.*;

@Entity
public class VisitDetailUserComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private VisitDetail visitDetail;
    @ManyToOne
    private User user;
    private String comment;

    public VisitDetailUserComment(VisitDetail visitDetail, User user, String comment) {
        this.visitDetail = visitDetail;
        this.user = user;
        this.comment = comment;
    }

    public VisitDetailUserComment() {
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
