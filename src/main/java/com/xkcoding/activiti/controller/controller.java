package com.xkcoding.activiti.controller;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
>>>>>>> origin/master
public class controller {

    @GetMapping("/fen")
    public Object fen(){
        return null;
    }
<<<<<<< HEAD
=======

    @PostMapping("/a")
    public Object fens(){
        return null;
    }

>>>>>>> origin/master
}
