package com.linhu.entity;

public class User {

    private String userName;

    private String passworld;

    private String age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passworld='" + passworld + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
