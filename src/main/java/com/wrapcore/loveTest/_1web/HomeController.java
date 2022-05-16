package com.wrapcore.loveTest._1web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "index";
    }
}
