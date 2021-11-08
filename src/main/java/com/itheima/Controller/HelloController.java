package com.itheima.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Value("${itcast.url}")
    private String itcastUrl;

    @Value("${itheima.url}")
    private String itheimaUrl;

    @GetMapping("hello")
    public String hello() {
        System.out.println(" itcastUrl = " + itcastUrl);
        System.out.println(" itheimaUrl " + itheimaUrl);
        System.out.println("DataSource" + dataSource);
        return "Hello,Spring Boot!";
    }
}
