package com.ll.a20250227.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    // 로그인 페이지
    @GetMapping("/login")
    public String login() {
        // templates/login.html을 반환
        return "login";
    }

    // 로그인 성공 후 이동할 페이지
    @GetMapping("/home")
    public String home() {
        return "homePage";
    }

    // 메인 페이지(테스트용)
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
