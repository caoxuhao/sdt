package com.cxh.test.domain;

import java.util.Date;

public class User {
    private String id;

    private String name;

    private String email;

    private String deptitle;

    private String grouptitle;

    private String txtitle;

    private Date lastLoginTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeptitle() {
        return deptitle;
    }

    public void setDeptitle(String deptitle) {
        this.deptitle = deptitle;
    }

    public String getGrouptitle() {
        return grouptitle;
    }

    public void setGrouptitle(String grouptitle) {
        this.grouptitle = grouptitle;
    }

    public String getTxtitle() {
        return txtitle;
    }

    public void setTxtitle(String txtitle) {
        this.txtitle = txtitle;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    
    @Override
    public String toString() {
    	return "id = " + getId() + ", name = " + getName() + ", email = " +getEmail();
    }
}