package com.nanxi.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Spring이 com.nanxi.blog package 이하를 스캔해서 모든 객체를 메모리에 new(생성)하는건 아니고
// 특정 Annotation이 붙어있는 객체들을 IoC Container에 new(생성)해서 관리한다.
@RestController
public class BlogControllerTest {
    
    @GetMapping("/test/hello")
    public String hello() {
        
        return "<h1>Hello Spring boot</h1>";
    }
}
