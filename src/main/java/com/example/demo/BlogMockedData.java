package com.example.demo;

import java.util.ArrayList;
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

    public BlogMockedData(){
        blogs = new ArrayList<Blog>();
        blogs.add(new Blog(1, "Title 1", "Content 1"));
        blogs.add(new Blog(2, "Title 2", "Content 2"));
        blogs.add(new Blog( 3, "Title 3", "Content 3"));
        blogs.add(new Blog( 4, "Title 4", "Content 5"));
    }

    //return all blogs
    public List<Blog> fetchBlogs() {
        return blogs;
    }
    public Blog getBlogById(int id) {
        for (Blog b: blogs) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }
}
