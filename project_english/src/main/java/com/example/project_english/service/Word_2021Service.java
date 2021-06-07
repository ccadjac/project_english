package com.example.project_english.service;

import com.example.project_english.bean.Word_2021;
import com.example.project_english.bean.Commit;

import java.util.List;

public interface Word_2021Service {
    Word_2021 getWord_2021ByMno(String Mno);
    void commit(String Mno,Commit commit);
    List<Word_2021> getAllWord_2021();
    List<Word_2021> search(String key);
}
