package com.company.objects;

public class Users {
    private String userType;
    private String userName;
    private String password;
    //hash funckiq
    public Users(){}

    public Users(String userType, String userName, String password){
        this.userType=userType;
        this.userName=userName;
        this.password=password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserType() {
        return userType;
    }
}

