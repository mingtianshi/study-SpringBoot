package com.xkcoding.activiti.controller;

import com.xkcoding.activiti.entity.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/user")
public class controclre {
    Map<Long, user> userMap = new HashMap<>();
    @PostMapping
    public void init(){


    }
}
