package com.wrapcore.loveTest._1web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
