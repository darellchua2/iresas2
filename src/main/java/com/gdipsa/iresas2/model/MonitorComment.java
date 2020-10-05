package com.gdipsa.iresas2.model;

import com.gdipsa.iresas2.enums.CommentStatus;
import com.gdipsa.iresas2.enums.CommentType;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class MonitorComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private VisitDetail visitDetail;
    //Monitor Name
    @ManyToOne
    private User monitor;
    private LocalDate commentDate;
    private LocalDate commentReplyDate;
    private String commentTitle;
    private String commentDescription;
    private CommentType commentType;
    private CommentStatus commentStatus;
    @ManyToOne
    private User commentAssignedTo;
    private String commentReplyByAssignedTo;

    public MonitorComment(VisitDetail visitDetail, User monitor, LocalDate commentDate, LocalDate commentReplyDate, String commentTitle, String commentDescription, CommentType commentType, CommentStatus commentStatus, User commentAssignedTo, String commentReplyByAssignedTo) {
        this.visitDetail = visitDetail;
        this.monitor = monitor;
        this.commentDate = commentDate;
        this.commentReplyDate = commentReplyDate;
        this.commentTitle = commentTitle;
        this.commentDescription = commentDescription;
        this.commentType = commentType;
        this.commentStatus = commentStatus;
        this.commentAssignedTo = commentAssignedTo;
        this.commentReplyByAssignedTo = commentReplyByAssignedTo;
    }

    public MonitorComment() {
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

    public User getMonitor() {
        return monitor;
    }

    public void setMonitor(User monitor) {
        this.monitor = monitor;
    }

    public LocalDate getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(LocalDate commentDate) {
        this.commentDate = commentDate;
    }

    public LocalDate getCommentReplyDate() {
        return commentReplyDate;
    }

    public void setCommentReplyDate(LocalDate commentReplyDate) {
        this.commentReplyDate = commentReplyDate;
    }

    public String getCommentTitle() {
        return commentTitle;
    }

    public void setCommentTitle(String commentTitle) {
        this.commentTitle = commentTitle;
    }

    public String getCommentDescription() {
        return commentDescription;
    }

    public void setCommentDescription(String commentDescription) {
        this.commentDescription = commentDescription;
    }

    public CommentType getCommentType() {
        return commentType;
    }

    public void setCommentType(CommentType commentType) {
        this.commentType = commentType;
    }

    public CommentStatus getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(CommentStatus commentStatus) {
        this.commentStatus = commentStatus;
    }

    public User getCommentAssignedTo() {
        return commentAssignedTo;
    }

    public void setCommentAssignedTo(User commentAssignedTo) {
        this.commentAssignedTo = commentAssignedTo;
    }

    public String getCommentReplyByAssignedTo() {
        return commentReplyByAssignedTo;
    }

    public void setCommentReplyByAssignedTo(String commentReplyByAssignedTo) {
        this.commentReplyByAssignedTo = commentReplyByAssignedTo;
    }
}
