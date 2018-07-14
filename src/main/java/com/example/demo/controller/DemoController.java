package com.example.demo.controller;


import com.example.demo.Blog;
import com.example.demo.BlogMockedData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DemoController {


    BlogMockedData blogMockedData = BlogMockedData.getInstance();

    @GetMapping("/blog")
    public List<Blog> index(){
        return blogMockedData.fetchBlogs();
    }
}
