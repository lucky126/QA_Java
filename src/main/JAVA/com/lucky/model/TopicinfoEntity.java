package com.lucky.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by lucky on 2016/3/7.
 */
@Entity
@Table(name = "bbs_topicinfo", schema = "bbs", catalog = "")
public class TopicinfoEntity {
    private int id;
    private int topicId;
    private int boardId;
    private String content;
    private int postUserId;
    private String postUserName;
    private Serializable postTime;
    private String postIp;
    private int isTopic;
    private int isAnswer;
    private int displayMode;
    private int answerMode;
    private int bbsStatus;
    private Serializable addTime;
    private Serializable updateTime;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TopicId", nullable = false)
    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    @Basic
    @Column(name = "BoardId", nullable = false)
    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    @Basic
    @Column(name = "Content", nullable = false, length = 5000)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "PostUserId", nullable = false)
    public int getPostUserId() {
        return postUserId;
    }

    public void setPostUserId(int postUserId) {
        this.postUserId = postUserId;
    }

    @Basic
    @Column(name = "PostUserName", nullable = false, length = 50)
    public String getPostUserName() {
        return postUserName;
    }

    public void setPostUserName(String postUserName) {
        this.postUserName = postUserName;
    }

    @Basic
    @Column(name = "PostTime", nullable = false)
    public Serializable getPostTime() {
        return postTime;
    }

    public void setPostTime(Serializable postTime) {
        this.postTime = postTime;
    }

    @Basic
    @Column(name = "PostIp", nullable = false, length = 256)
    public String getPostIp() {
        return postIp;
    }

    public void setPostIp(String postIp) {
        this.postIp = postIp;
    }

    @Basic
    @Column(name = "IsTopic", nullable = false)
    public int getIsTopic() {
        return isTopic;
    }

    public void setIsTopic(int isTopic) {
        this.isTopic = isTopic;
    }

    @Basic
    @Column(name = "IsAnswer", nullable = false)
    public int getIsAnswer() {
        return isAnswer;
    }

    public void setIsAnswer(int isAnswer) {
        this.isAnswer = isAnswer;
    }

    @Basic
    @Column(name = "DisplayMode", nullable = false)
    public int getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(int displayMode) {
        this.displayMode = displayMode;
    }

    @Basic
    @Column(name = "AnswerMode", nullable = false)
    public int getAnswerMode() {
        return answerMode;
    }

    public void setAnswerMode(int answerMode) {
        this.answerMode = answerMode;
    }

    @Basic
    @Column(name = "BBSStatus", nullable = false)
    public int getBbsStatus() {
        return bbsStatus;
    }

    public void setBbsStatus(int bbsStatus) {
        this.bbsStatus = bbsStatus;
    }

    @Basic
    @Column(name = "AddTime", nullable = false)
    public Serializable getAddTime() {
        return addTime;
    }

    public void setAddTime(Serializable addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "UpdateTime", nullable = false)
    public Serializable getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Serializable updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TopicinfoEntity that = (TopicinfoEntity) o;

        if (id != that.id) return false;
        if (topicId != that.topicId) return false;
        if (boardId != that.boardId) return false;
        if (postUserId != that.postUserId) return false;
        if (isTopic != that.isTopic) return false;
        if (isAnswer != that.isAnswer) return false;
        if (displayMode != that.displayMode) return false;
        if (answerMode != that.answerMode) return false;
        if (bbsStatus != that.bbsStatus) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (postUserName != null ? !postUserName.equals(that.postUserName) : that.postUserName != null) return false;
        if (postTime != null ? !postTime.equals(that.postTime) : that.postTime != null) return false;
        if (postIp != null ? !postIp.equals(that.postIp) : that.postIp != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + topicId;
        result = 31 * result + boardId;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + postUserId;
        result = 31 * result + (postUserName != null ? postUserName.hashCode() : 0);
        result = 31 * result + (postTime != null ? postTime.hashCode() : 0);
        result = 31 * result + (postIp != null ? postIp.hashCode() : 0);
        result = 31 * result + isTopic;
        result = 31 * result + isAnswer;
        result = 31 * result + displayMode;
        result = 31 * result + answerMode;
        result = 31 * result + bbsStatus;
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
