package com.xiaotian.ssm.pojo;

import java.util.Date;

/**
 * @author longxiaotian
 * id int(11) not null auto_increment,
 * name varchar(20) not null,
 * nickname varchar(20) default null,
 * sex char(1) default null,
 * birthday datetime default null ,
 * primary key(id)
 */
public class User {
    private int id;
    private String name;
    private String nickName;
    private String sex;
    private Date birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
