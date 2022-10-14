package com.study.mvc20220927yujin.repository;


import org.springframework.stereotype.Component;

@Component  // Ioc 등록 됨
public class TestRepositoryImpl implements TestRepository{

    @Override
    public void insert() {
        System.out.println("Test1 저장소에 저장하기");
    }

    @Override
    public void select() {
        System.out.println("Test1 저장소에 조회하기");

    }
}
