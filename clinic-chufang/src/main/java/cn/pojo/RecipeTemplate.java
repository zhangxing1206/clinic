package cn.pojo;

import java.util.Date;

public class RecipeTemplate {
    private int id;
    private String temNo;
    private String temName;
    private String temType;
    private String temDiag;
    private String temPermission;
    private Date createTime;
    private int createPerson;
    private String description;
    private String emName;
    private String reName;

    @Override
    public String toString() {
        return "RecipeTemplate{" +
                "id=" + id +
                ", temNo='" + temNo + '\'' +
                ", temName='" + temName + '\'' +
                ", temType='" + temType + '\'' +
                ", temDiag='" + temDiag + '\'' +
                ", temPermission='" + temPermission + '\'' +
                ", createTime=" + createTime +
                ", createPerson=" + createPerson +
                ", description='" + description + '\'' +
                ", emName='" + emName + '\'' +
                ", reName='" + reName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTemNo() {
        return temNo;
    }

    public void setTemNo(String temNo) {
        this.temNo = temNo;
    }

    public String getTemName() {
        return temName;
    }

    public void setTemName(String temName) {
        this.temName = temName;
    }

    public String getTemType() {
        return temType;
    }

    public void setTemType(String temType) {
        this.temType = temType;
    }

    public String getTemDiag() {
        return temDiag;
    }

    public void setTemDiag(String temDiag) {
        this.temDiag = temDiag;
    }

    public String getTemPermission() {
        return temPermission;
    }

    public void setTemPermission(String temPermission) {
        this.temPermission = temPermission;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(int createPerson) {
        this.createPerson = createPerson;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName;
    }

    public String getReName() {
        return reName;
    }

    public void setReName(String reName) {
        this.reName = reName;
    }
}
