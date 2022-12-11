package com.example.formtest.member.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

@Controller
public class MemberController {
    ArrayList<HashMap<String,String>> memberList=new ArrayList<HashMap<String,String>>();

    //회원가입
    @PostMapping("signup")
    public String signup(@RequestParam HashMap<String,String> params){
        memberList.add(params);
        return "index";
    }

    //로그인
    @PostMapping("login")
    public String login(@RequestParam HashMap<String,String> params, HttpSession session){

        for(HashMap<String,String>  member:memberList){
            if(member.get("email").equals(params.get("email"))&&member.get("password").equals(params.get("password"))){
                session.setAttribute("email",params.get("email"));
            }
        }

        return "index";
    }

    //로그아웃
    @GetMapping("logout")
    public String logout(HttpSession session){
        session.setAttribute("email",null);
        return "index";
    }
}
