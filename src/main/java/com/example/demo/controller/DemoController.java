package com.example.demo.controller;


import com.example.demo.Blog;
import com.example.demo.BlogMockedData;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
public class DemoController {


    BlogMockedData blogMockedData = BlogMockedData.getInstance();

    @GetMapping("/blog")
    public List<Blog> index(){
        return blogMockedData.fetchBlogs();
    }

    @GetMapping("/blog/{id}")
    public Blog show(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        return blogMockedData.getBlogById(blogId);
    }

    @PostMapping("/blog/search")
    public List<Blog> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("text");
        return blogMockedData.searchBlogs(searchTerm);
    }
}
