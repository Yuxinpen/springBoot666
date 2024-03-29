package com.qainfeng.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

public class User {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    
    @JsonIgnore
    private String password;
    //@JsonFormat(pattern = "yyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date entryDate;

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
