package com.example.project_english.bean;

public class wCommit {
    Integer id;
    User user;
    String context;

    public wCommit(Integer id, User user, String context) {
        this.id = id;
        this.user = user;
        this.context = context;
    }

    public Integer getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getContext() {
        return context;
    }
}
