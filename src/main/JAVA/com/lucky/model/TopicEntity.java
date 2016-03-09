package com.lucky.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by lucky on 2016/3/7.
 */
@Entity
@javax.persistence.Table(name = "bbs_topic", schema = "bbs", catalog = "")
public class TopicEntity {
    private int id;

    @Id
    @javax.persistence.Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int boardId;

    @Basic
    @javax.persistence.Column(name = "BoardId", nullable = false)
    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    private int topicType;

    @Basic
    @javax.persistence.Column(name = "TopicType", nullable = false)
    public int getTopicType() {
        return topicType;
    }

    public void setTopicType(int topicType) {
        this.topicType = topicType;
    }

    private String title;

    @Basic
    @javax.persistence.Column(name = "Title", nullable = false, length = 256)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String keywords;

    @Basic
    @javax.persistence.Column(name = "Keywords", nullable = false, length = 256)
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    private int postUserId;

    @Basic
    @javax.persistence.Column(name = "PostUserId", nullable = false)
    public int getPostUserId() {
        return postUserId;
    }

    public void setPostUserId(int postUserId) {
        this.postUserId = postUserId;
    }

    private String postUserName;

    @Basic
    @javax.persistence.Column(name = "PostUserName", nullable = false, length = 50)
    public String getPostUserName() {
        return postUserName;
    }

    public void setPostUserName(String postUserName) {
        this.postUserName = postUserName;
    }

    private Serializable postTime;

    @Basic
    @javax.persistence.Column(name = "PostTime", nullable = false)
    public Serializable getPostTime() {
        return postTime;
    }

    public void setPostTime(Serializable postTime) {
        this.postTime = postTime;
    }

    private Serializable updateTime;

    @Basic
    @javax.persistence.Column(name = "UpdateTime", nullable = false)
    public Serializable getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Serializable updateTime) {
        this.updateTime = updateTime;
    }

    private String postIp;

    @Basic
    @javax.persistence.Column(name = "PostIp", nullable = false, length = 256)
    public String getPostIp() {
        return postIp;
    }

    public void setPostIp(String postIp) {
        this.postIp = postIp;
    }

    private Integer lastPostUserId;

    @Basic
    @javax.persistence.Column(name = "LastPostUserId", nullable = true)
    public Integer getLastPostUserId() {
        return lastPostUserId;
    }

    public void setLastPostUserId(Integer lastPostUserId) {
        this.lastPostUserId = lastPostUserId;
    }

    private String lastPostUserName;

    @Basic
    @javax.persistence.Column(name = "LastPostUserName", nullable = true, length = 50)
    public String getLastPostUserName() {
        return lastPostUserName;
    }

    public void setLastPostUserName(String lastPostUserName) {
        this.lastPostUserName = lastPostUserName;
    }

    private Serializable lastPostTime;

    @Basic
    @javax.persistence.Column(name = "LastPostTime", nullable = true)
    public Serializable getLastPostTime() {
        return lastPostTime;
    }

    public void setLastPostTime(Serializable lastPostTime) {
        this.lastPostTime = lastPostTime;
    }

    private int topicStatus;

    @Basic
    @javax.persistence.Column(name = "TopicStatus", nullable = false)
    public int getTopicStatus() {
        return topicStatus;
    }

    public void setTopicStatus(int topicStatus) {
        this.topicStatus = topicStatus;
    }

    private int isFinish;

    @Basic
    @javax.persistence.Column(name = "IsFinish", nullable = false)
    public int getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(int isFinish) {
        this.isFinish = isFinish;
    }

    private int isLock;

    @Basic
    @javax.persistence.Column(name = "IsLock", nullable = false)
    public int getIsLock() {
        return isLock;
    }

    public void setIsLock(int isLock) {
        this.isLock = isLock;
    }

    private int isDigest;

    @Basic
    @javax.persistence.Column(name = "IsDigest", nullable = false)
    public int getIsDigest() {
        return isDigest;
    }

    public void setIsDigest(int isDigest) {
        this.isDigest = isDigest;
    }

    private int topLevel;

    @Basic
    @javax.persistence.Column(name = "TopLevel", nullable = false)
    public int getTopLevel() {
        return topLevel;
    }

    public void setTopLevel(int topLevel) {
        this.topLevel = topLevel;
    }

    private int child;

    @Basic
    @javax.persistence.Column(name = "Child", nullable = false)
    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    private int hits;

    @Basic
    @javax.persistence.Column(name = "Hits", nullable = false)
    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TopicEntity that = (TopicEntity) o;

        if (id != that.id) return false;
        if (boardId != that.boardId) return false;
        if (topicType != that.topicType) return false;
        if (postUserId != that.postUserId) return false;
        if (topicStatus != that.topicStatus) return false;
        if (isFinish != that.isFinish) return false;
        if (isLock != that.isLock) return false;
        if (isDigest != that.isDigest) return false;
        if (topLevel != that.topLevel) return false;
        if (child != that.child) return false;
        if (hits != that.hits) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        if (postUserName != null ? !postUserName.equals(that.postUserName) : that.postUserName != null) return false;
        if (postTime != null ? !postTime.equals(that.postTime) : that.postTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (postIp != null ? !postIp.equals(that.postIp) : that.postIp != null) return false;
        if (lastPostUserId != null ? !lastPostUserId.equals(that.lastPostUserId) : that.lastPostUserId != null)
            return false;
        if (lastPostUserName != null ? !lastPostUserName.equals(that.lastPostUserName) : that.lastPostUserName != null)
            return false;
        if (lastPostTime != null ? !lastPostTime.equals(that.lastPostTime) : that.lastPostTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + boardId;
        result = 31 * result + topicType;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + postUserId;
        result = 31 * result + (postUserName != null ? postUserName.hashCode() : 0);
        result = 31 * result + (postTime != null ? postTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (postIp != null ? postIp.hashCode() : 0);
        result = 31 * result + (lastPostUserId != null ? lastPostUserId.hashCode() : 0);
        result = 31 * result + (lastPostUserName != null ? lastPostUserName.hashCode() : 0);
        result = 31 * result + (lastPostTime != null ? lastPostTime.hashCode() : 0);
        result = 31 * result + topicStatus;
        result = 31 * result + isFinish;
        result = 31 * result + isLock;
        result = 31 * result + isDigest;
        result = 31 * result + topLevel;
        result = 31 * result + child;
        result = 31 * result + hits;
        return result;
    }
}
