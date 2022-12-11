package com.example.formtest.todo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ToDoController {

    ArrayList<String> todolist = new ArrayList<>();

    @GetMapping("/list")
    public ArrayList<String> viewList(){
        return todolist;
    }

    @GetMapping("/receiveList")
    public ArrayList<String> receiveList(String todo) {
        todolist.add(todo);
        return todolist;
    }

    @GetMapping("/deleteList")
    public ArrayList<String> deleteList(int todo){
        todolist.remove(todo);
        return todolist;
    }


}
