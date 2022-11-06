package com.dyp.mybatis.pojo;

public class Dept {
    private Integer deptId;
    private String deptName;

    public Dept() {
    }

    public Dept(Integer detpID, String deptName) {
        this.deptId = detpID;
        this.deptName = deptName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
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
                "detpID=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
