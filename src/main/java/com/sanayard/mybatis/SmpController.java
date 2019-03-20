package com.sanayard.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmpController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        userService.test();
        return "hello";
    }
}
