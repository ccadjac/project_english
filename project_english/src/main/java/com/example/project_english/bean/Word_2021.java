package com.example.project_english.bean;

import java.util.List;

public class Word_2021 {
    String Wno;
    String Weng;
    String Mno;
    String Wpar;
    String Wchi;
    List<Commit> commits;

    public Word_2021(String Wno, String Weng, String Mno, String Wpar, String Wchi, List<Commit> commits) {
        this.Wno = Wno;
        this.Weng = Weng;
        this.Mno = Mno;
        this.Wpar = Wpar;
        this.Wchi = Wchi;
        this.commits = commits;
    }

    public Word_2021(List<Commit> commits) {
        this.commits = commits;
    }

    public String getWno() {
        return Wno;
    }

    public void setWno(String wno) {
        Wno = wno;
    }

    public String getWeng() {
        return Weng;
    }

    public void setWeng(String weng) {
        Weng = weng;
    }

    public String getMno() {
        return Mno;
    }

    public void setMno(String mno) {
        Mno = mno;
    }

    public String getWpar() {
        return Wpar;
    }

    public void setWpar(String wpar) {
        Wpar = wpar;
    }

    public String getWchi() {
        return Wchi;
    }

    public void setWchi(String wchi) {
        Wchi = wchi;
    }

    public List<Commit> getCommits() {
        return commits;
    }
}
