package com.blog.entity;

import java.sql.Timestamp;



public class User {
    private String userName;
    private String userPassword;
    private Number phone;
    private String address;
    private Timestamp date;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return userPassword;
    }

    public void setPassword(String password) {
        this.userPassword = password;
    }

    public Number getPhone() {
        return phone;
    }

    public void setPhone(Number phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + userPassword + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", date=" + date +
                '}';
    }
}
