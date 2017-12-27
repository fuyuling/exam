package com.xiaoxi.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * 配置@RequestMapping 拦截 localhost:8080/springmvc/hello 请求
     * @return
     */
    @RequestMapping("/hello")
    public String helloWorld() {
        System.out.println("hello world");
        return "hello world";
    }

}
