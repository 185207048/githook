package com.example.demo2.controllercontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexContoller {
    @RequestMapping("/")
    public String index() {
        return "my hook";
    }
}
