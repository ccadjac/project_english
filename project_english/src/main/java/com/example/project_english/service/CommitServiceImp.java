package com.example.project_english.service;

import com.example.project_english.bean.Commit;
import com.example.project_english.bean.User;
import com.example.project_english.mapper.CommitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommitServiceImp implements CommitService{
    @Autowired
    UserService userService;
    @Autowired
    Word_2021Service word_2021Service;
    @Autowired
    CommitMapper mapper;
    @Override
    public Commit getCommitByID(Integer id) {
        User user=userService.getUserByID(mapper.getUserIdByID(id));
        String context=mapper.getContextByID(id);
        return new Commit(id,user,context);
    }

    @Override
    public void commitChara(String Mno, Integer user, String context) {
        Integer newId=mapper.getMaxId()+1;
        mapper.commit(newId,user,context);
        word_2021Service.commit(Mno,getCommitByID(newId));
    }

}
