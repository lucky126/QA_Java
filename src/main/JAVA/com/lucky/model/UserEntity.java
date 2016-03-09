package com.lucky.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by lucky on 2016/3/7.
 */
@Entity
@javax.persistence.Table(name = "bbs_user", schema = "bbs", catalog = "")
public class UserEntity {
    private int id;

    @Id
    @javax.persistence.Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int userLevel;

    @Basic
    @javax.persistence.Column(name = "UserLevel", nullable = false)
    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    private String loginName;

    @Basic
    @javax.persistence.Column(name = "LoginName", nullable = false, length = 50)
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    private String password;

    @Basic
    @javax.persistence.Column(name = "Password", nullable = false, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String nickName;

    @Basic
    @javax.persistence.Column(name = "NickName", nullable = false, length = 50)
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    private String realName;

    @Basic
    @javax.persistence.Column(name = "RealName", nullable = false, length = 50)
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    private String gender;

    @Basic
    @javax.persistence.Column(name = "Gender", nullable = false, length = 10)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String userEmail;

    @Basic
    @javax.persistence.Column(name = "UserEmail", nullable = true, length = 255)
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    private String userSign;

    @Basic
    @javax.persistence.Column(name = "UserSign", nullable = false, length = 1000)
    public String getUserSign() {
        return userSign;
    }

    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }

    private String userQuesion;

    @Basic
    @javax.persistence.Column(name = "UserQuesion", nullable = false, length = 50)
    public String getUserQuesion() {
        return userQuesion;
    }

    public void setUserQuesion(String userQuesion) {
        this.userQuesion = userQuesion;
    }

    private String userAnswer;

    @Basic
    @javax.persistence.Column(name = "UserAnswer", nullable = false, length = 50)
    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    private Serializable addTime;

    @Basic
    @javax.persistence.Column(name = "AddTime", nullable = false)
    public Serializable getAddTime() {
        return addTime;
    }

    public void setAddTime(Serializable addTime) {
        this.addTime = addTime;
    }

    private Serializable updateTime;

    @Basic
    @javax.persistence.Column(name = "updateTime", nullable = false)
    public Serializable getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Serializable updateTime) {
        this.updateTime = updateTime;
    }

    private String addIp;

    @Basic
    @javax.persistence.Column(name = "AddIp", nullable = false, length = 255)
    public String getAddIp() {
        return addIp;
    }

    public void setAddIp(String addIp) {
        this.addIp = addIp;
    }

    private int topicCnt;

    @Basic
    @javax.persistence.Column(name = "TopicCnt", nullable = false)
    public int getTopicCnt() {
        return topicCnt;
    }

    public void setTopicCnt(int topicCnt) {
        this.topicCnt = topicCnt;
    }

    private int postCnt;

    @Basic
    @javax.persistence.Column(name = "PostCnt", nullable = false)
    public int getPostCnt() {
        return postCnt;
    }

    public void setPostCnt(int postCnt) {
        this.postCnt = postCnt;
    }

    private int delCnt;

    @Basic
    @javax.persistence.Column(name = "DelCnt", nullable = false)
    public int getDelCnt() {
        return delCnt;
    }

    public void setDelCnt(int delCnt) {
        this.delCnt = delCnt;
    }

    private int loginCnt;

    @Basic
    @javax.persistence.Column(name = "LoginCnt", nullable = false)
    public int getLoginCnt() {
        return loginCnt;
    }

    public void setLoginCnt(int loginCnt) {
        this.loginCnt = loginCnt;
    }

    private int grade;

    @Basic
    @javax.persistence.Column(name = "Grade", nullable = false)
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    private Serializable lastLoginTime;

    @Basic
    @javax.persistence.Column(name = "LastLoginTime", nullable = false)
    public Serializable getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Serializable lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    private int userStatus;

    @Basic
    @javax.persistence.Column(name = "UserStatus", nullable = false)
    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (userLevel != that.userLevel) return false;
        if (topicCnt != that.topicCnt) return false;
        if (postCnt != that.postCnt) return false;
        if (delCnt != that.delCnt) return false;
        if (loginCnt != that.loginCnt) return false;
        if (grade != that.grade) return false;
        if (userStatus != that.userStatus) return false;
        if (loginName != null ? !loginName.equals(that.loginName) : that.loginName != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (nickName != null ? !nickName.equals(that.nickName) : that.nickName != null) return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (userSign != null ? !userSign.equals(that.userSign) : that.userSign != null) return false;
        if (userQuesion != null ? !userQuesion.equals(that.userQuesion) : that.userQuesion != null) return false;
        if (userAnswer != null ? !userAnswer.equals(that.userAnswer) : that.userAnswer != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (addIp != null ? !addIp.equals(that.addIp) : that.addIp != null) return false;
        if (lastLoginTime != null ? !lastLoginTime.equals(that.lastLoginTime) : that.lastLoginTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userLevel;
        result = 31 * result + (loginName != null ? loginName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userSign != null ? userSign.hashCode() : 0);
        result = 31 * result + (userQuesion != null ? userQuesion.hashCode() : 0);
        result = 31 * result + (userAnswer != null ? userAnswer.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (addIp != null ? addIp.hashCode() : 0);
        result = 31 * result + topicCnt;
        result = 31 * result + postCnt;
        result = 31 * result + delCnt;
        result = 31 * result + loginCnt;
        result = 31 * result + grade;
        result = 31 * result + (lastLoginTime != null ? lastLoginTime.hashCode() : 0);
        result = 31 * result + userStatus;
        return result;
    }
}
