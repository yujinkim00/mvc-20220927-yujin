package com.study.mvc20220927yujin.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean  // 라이브러리 메소드 ioc 저장 방법
    public TestSetting testSetting() {
        return new TestSetting();

    }
}
