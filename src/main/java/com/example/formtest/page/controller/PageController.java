package com.example.formtest.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {


    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/goLogin")
    public String login(){
        return "login";
    }
    @GetMapping("/goSignUp")
    public String signUp(){
        return "signup";
    }
    @GetMapping("/goChat")
    public String goMember(HttpSession session){
        if(session.getAttribute("email")==null){
            return "singup";
        }else{//로그인을 한 경우
            session.setAttribute("nickName",session.getAttribute("email"));
            return "chat";
        }
    }

    @GetMapping("/goCalendar")
    public String goCalendar(HttpSession session){
        if (session.getAttribute("email") == null) {
            return "signup";
        }else{
            session.setAttribute("nickName",session.getAttribute("email"));
            return "calendar";
        }
    }

    @GetMapping("/goToDo")
    public String goToDo(HttpSession session){
        if (session.getAttribute("email") == null) {
            return "signup";
        }else{
            session.setAttribute("nickName",session.getAttribute("email"));
            return "todolist";
        }
    }

}
