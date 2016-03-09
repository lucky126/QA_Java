package com.lucky.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lucky on 2016/3/7.
 */
@Entity
@Table(name = "bbs_board", schema = "bbs", catalog = "")
public class BoardEntity {
    private int id;
    private String boardName;
    private int depth;
    private int parentId;
    private int rootId;
    private int boardOrder;
    private int isLeaf;
    private int isPublic;
    private int boardType;
    private String boardMaster;
    private Date addTime;
    private Date updateTime;
    private int topicNum;
    private int postNum;
    private String parentStr;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BoardName", nullable = false, length = 256)
    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    @Basic
    @Column(name = "Depth", nullable = false)
    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Basic
    @Column(name = "ParentID", nullable = false)
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "RootID", nullable = false)
    public int getRootId() {
        return rootId;
    }

    public void setRootId(int rootId) {
        this.rootId = rootId;
    }

    @Basic
    @Column(name = "BoardOrder", nullable = false)
    public int getBoardOrder() {
        return boardOrder;
    }

    public void setBoardOrder(int boardOrder) {
        this.boardOrder = boardOrder;
    }

    @Basic
    @Column(name = "IsLeaf", nullable = false)
    public int getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(int isLeaf) {
        this.isLeaf = isLeaf;
    }

    @Basic
    @Column(name = "IsPublic", nullable = false)
    public int getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(int isPublic) {
        this.isPublic = isPublic;
    }

    @Basic
    @Column(name = "BoardType", nullable = false)
    public int getBoardType() {
        return boardType;
    }

    public void setBoardType(int boardType) {
        this.boardType = boardType;
    }

    @Basic
    @Column(name = "BoardMaster", nullable = false, length = 1000)
    public String getBoardMaster() {
        return boardMaster;
    }

    public void setBoardMaster(String boardMaster) {
        this.boardMaster = boardMaster;
    }

    @Basic
    @Column(name = "AddTime", nullable = false)
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "UpdateTime", nullable = false)
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "TopicNum", nullable = false)
    public int getTopicNum() {
        return topicNum;
    }

    public void setTopicNum(int topicNum) {
        this.topicNum = topicNum;
    }

    @Basic
    @Column(name = "PostNum", nullable = false)
    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    @Basic
    @Column(name = "ParentStr", nullable = false, length = 200)
    public String getParentStr() {
        return parentStr;
    }

    public void setParentStr(String parentStr) {
        this.parentStr = parentStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoardEntity that = (BoardEntity) o;

        if (id != that.id) return false;
        if (depth != that.depth) return false;
        if (parentId != that.parentId) return false;
        if (rootId != that.rootId) return false;
        if (boardOrder != that.boardOrder) return false;
        if (isLeaf != that.isLeaf) return false;
        if (isPublic != that.isPublic) return false;
        if (boardType != that.boardType) return false;
        if (topicNum != that.topicNum) return false;
        if (postNum != that.postNum) return false;
        if (boardName != null ? !boardName.equals(that.boardName) : that.boardName != null) return false;
        if (boardMaster != null ? !boardMaster.equals(that.boardMaster) : that.boardMaster != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (parentStr != null ? !parentStr.equals(that.parentStr) : that.parentStr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (boardName != null ? boardName.hashCode() : 0);
        result = 31 * result + depth;
        result = 31 * result + parentId;
        result = 31 * result + rootId;
        result = 31 * result + boardOrder;
        result = 31 * result + isLeaf;
        result = 31 * result + isPublic;
        result = 31 * result + boardType;
        result = 31 * result + (boardMaster != null ? boardMaster.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + topicNum;
        result = 31 * result + postNum;
        result = 31 * result + (parentStr != null ? parentStr.hashCode() : 0);
        return result;
    }
}
