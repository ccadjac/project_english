package com.example.project_english.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface Word_2021Mapper {
    @Select("SELECT Wno FROM word_Meaning_2021 WHERE Mno=#{Mno}")
    String getWnoByMno(String Mno);
    @Select("SELECT Weng FROM word_Meaning_2021 WHERE Mno=#{Mno}")
    String getWengByMno(String Mno);
    @Select("SELECT Wpar FROM word_Meaning_2021 WHERE Mno=#{Mno}")
    String getWparByMno(String Mno);
    @Select("SELECT Wchi FROM word_Meaning_2021 WHERE Mno=#{Mno}")
    String getWchiByMno(String Mno);
    @Select("SELECT Commits FROM word_Meaning_2021 WHERE Mno=#{Mno}")
    String getCommitsByMno(String Mno);
    @Select("SELECT Mno FROM word_Meaning_2021")
    List<String> getAllMno();

    @Select("SELECT Mno FROM word_Meaning_2021 WHERE Weng=#{Weng}")
    List<String> search(String Weng);

    @Update("UPDATE word_Meaning_2021 SET commits=#{commits} WHERE Mno=#{Mno}")
    void setCommits(String commits,String Mno);
}
