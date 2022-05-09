package org.chexx.demo.service;

import java.util.HashSet;

import org.chexx.demo.modal.Blog;

public interface IBlogService {
    HashSet<Blog> findAllBlog();
    Blog findBlogByID(long id);
    void addBlog(Blog b);
    void deleteBlog(long id);
    void deleteAllData();
}
