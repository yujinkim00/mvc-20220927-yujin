package com.study.mvc20220927yujin.service;


import org.springframework.stereotype.Component;

@Component  // Ioc 등록 됨
public class TestServiceimpl  implements TestService {


    @Override
    public void logic1() {
        System.out.println("테스트1클래스에서 logic1 메소드 실행");
    }

    @Override
    public void logic2() {
        System.out.println("테스트1클래스에서 logic2 메소드 실행");

    }
}
