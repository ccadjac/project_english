package com.example.project_english.service;

import com.example.project_english.bean.Word_2021;
import com.example.project_english.bean.Commit;
import com.example.project_english.mapper.Word_2021Mapper;
import com.example.project_english.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Word_2021ServiceImp implements Word_2021Service {

    @Autowired
    Word_2021Mapper mapper;
    @Autowired
    CommitService commitService;
    @Override
    public Word_2021 getWord_2021ByMno(String Mno) {
        String Wno = mapper.getWnoByMno(Mno);
        String Weng = mapper.getWengByMno(Mno);
        String Wpar = mapper.getWparByMno(Mno);
        String Wchi = mapper.getWchiByMno(Mno);

        List<Integer> commitIds=IdUtil.str2list(mapper.getCommitsByMno(Mno));
        List<Commit> commits=new ArrayList<>();
        for(Integer i:commitIds){
            commits.add(commitService.getCommitByID(i));
        }
        Word_2021 w=new Word_2021(Wno,Weng,Mno,Wpar,Wchi,commits);
        return w;
    }

    @Override
    public void commit(String Mno,Commit commit) {
        Word_2021 w=getWord_2021ByMno(Mno);
        List<Commit> commits=w.getCommits();
        commits.add(commit);
        List<Integer> ids=new ArrayList<>();
        for(Commit com:commits){
            ids.add(com.getId());
        }
        mapper.setCommits(IdUtil.list2str(ids),Mno);
    }

    @Override
    public List<Word_2021> getAllWord_2021() {
        List<String> Mnos=mapper.getAllMno();
        List<Word_2021> results=new ArrayList<>();
        for(String Mno:Mnos){
            results.add(getWord_2021ByMno(Mno));
        }
        return results;
    }

    @Override
    public List<Word_2021> search(String key) {
        List<String> Mnos=mapper.search(key);
        List<Word_2021> result=new ArrayList<>();
        for(String Mno:Mnos){
            result.add(getWord_2021ByMno(Mno));
        }
        return result;
    }

}
