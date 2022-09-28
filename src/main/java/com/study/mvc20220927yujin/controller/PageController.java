package com.study.mvc20220927yujin.controller;

import com.study.mvc20220927yujin.dto.TestReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    /*요청 주소*/@GetMapping("/test1")/*uri 주소! 내맘대로*/
    /* get-read   post-create   put-update   del-delete*/
    public String test1() {
        /*응답*/return "test_page1";

    }@GetMapping("/test2")
    public String test2() {
        System.out.println("test2");
        return "test/test_page2";

    }
    @GetMapping("/test3")
    public String test3(Model model, @RequestParam String strData, @RequestParam String name) {
        System.out.println(strData);
        System.out.println(name);

        model.addAttribute("data",strData);
        model.addAttribute("name",name);
        return "test/test_page3";

    }

    @GetMapping("/test4")
    public String test4(Model model,TestReqDto testReqDto) {

        System.out.println(testReqDto);

        /*System.out.println(testReqDto.getStrData());
        System.out.println(testReqDto.getName());
        System.out.println(testReqDto.getNumber());*/

        model.addAttribute("data",testReqDto.getStrData());
        model.addAttribute("name",testReqDto.getName());
        model.addAttribute("number",testReqDto.getNumber());

        return "test/test_page4";

    }
}
