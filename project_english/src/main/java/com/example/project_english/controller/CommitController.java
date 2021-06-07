package com.example.project_english.controller;

import com.example.project_english.service.CommitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class CommitController {
    @Autowired
    CommitService commitService;
    @PostMapping("/commitChara")
    public void commit(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer userId=Integer.valueOf(request.getParameter("userId"));
        String context=request.getParameter("context");
        String Mno=String.valueOf(request.getParameter("Mno"));
        commitService.commitChara(Mno,userId,context);
        //下一行为页面跳转到角色页面，不知道改成什么
        //response.sendRedirect("/chara?id="+charaId);
    }
}
