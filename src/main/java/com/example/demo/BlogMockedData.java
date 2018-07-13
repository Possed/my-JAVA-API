package com.example.demo;

import java.util.List;

public class BlogMockedData {
    //list of blog posts
    private List<Blog> blogs;

    private static BlogMockedData instance = null;
    public static BlogMockedData getInstance(){
        if(instance == null){
            instance = new BlogMockedData();
        }
        return instance;
    }
}
