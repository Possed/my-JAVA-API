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
        blogs.add(new Blog( 4, "Title 4", "Content 4"));
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

    //search blog by text
    public List<Blog> searchBlogs(String searchTerm) {
        List<Blog> searchedBlogs = new ArrayList<Blog>();
        for (Blog b: blogs) {
            if (b.getTitle().toLowerCase().contains(searchTerm.toLowerCase()) ||
                    b.getContent().toLowerCase().contains(searchTerm.toLowerCase())){
                searchedBlogs.add(b);
            }
        }
        return searchedBlogs;
    }

    //create blog
    public Blog createBlog(int id, String title, String content) {
        Blog newBlog = new Blog(id, title, content);
        blogs.add(newBlog);
        return newBlog;
    }

    //update blog
    public Blog updateBlog(int id, String title, String content) {
        for (Blog b: blogs) {
            if (b.getId() == id) {
                int blogIndex = blogs.indexOf(b);
                b.setTitle(title);
                b.setContent(content);
                blogs.set(blogIndex, b);
                return b;
            }
        }
        return null;
    }

    //delete blog by id
    public boolean delete(int id){
        int blogIndex = -1;
        for (Blog b: blogs) {
            if (b.getId() == id) {
                blogIndex = blogs.indexOf(b);
                continue;
            }
        }
        if(blogIndex > -1) {
            blogs.remove(blogIndex);
        }
        return true;
    }

}
