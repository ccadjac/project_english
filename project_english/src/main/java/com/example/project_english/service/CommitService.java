package com.example.project_english.service;

import com.example.project_english.bean.Commit;

public interface CommitService {
    Commit getCommitByID(Integer id);
    void commitChara(String Mno,Integer user,String context);
}
