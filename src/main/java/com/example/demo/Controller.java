package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin(origins = {"http://localhost:80", "http://127.0.0.1:80"})
@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    @GetMapping("/trainer")
    @ResponseBody
    public Member first_page(HttpServletRequest request) throws Exception {
        Member member = new Member();
        member.setName("from /trainer, port : 8002");
        return member;
    }
}
