package com.zee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/task")
public class TaskController {

    @GetMapping("/create")
    public String createTask(Model model){


        return "task/create";
    }
}
