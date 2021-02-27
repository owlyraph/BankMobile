package com.example.bankmobile;
public class SingletonSession {
    private static SingletonSession instance;
    private String username,password;
    //no outer class can initialize this class's object
    private SingletonSession() {}
    public static SingletonSession Instance()
    {
        //if no instance is initialized yet then create new instance
        //else return stored instance
        if (instance == null)
        {
            instance = new SingletonSession();
        }
        return instance;
    }
    public String getUsername() {
        return username ;
    }
    public String getPassword() {
        return password ;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
