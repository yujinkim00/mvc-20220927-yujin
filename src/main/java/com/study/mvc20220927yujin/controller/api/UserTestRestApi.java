package com.study.mvc20220927yujin.controller.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserTestRestApi {

    @GetMapping("/api/test/user/rest")
        public String getUserName(){
            return "김유진";
    }
}
