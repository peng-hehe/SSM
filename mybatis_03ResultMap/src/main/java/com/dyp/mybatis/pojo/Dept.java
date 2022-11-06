package com.dyp.mybatis.pojo;

public class Dept {
    private Integer detpID;
    private String deptName;

    public Dept() {
    }

    public Dept(Integer detpID, String deptName) {
        this.detpID = detpID;
        this.deptName = deptName;
    }

    public Integer getDetpID() {
        return detpID;
    }

    public void setDetpID(Integer detpID) {
        this.detpID = detpID;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "detpID=" + detpID +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
