package org.chexx.demo.controller;

import java.util.HashSet;
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
  
import org.chexx.demo.modal.Blog;
import org.chexx.demo.modal.Category;
import org.chexx.demo.service.BlogService;
  
@RestController
public class BlogController {
  
    @Autowired
    BlogService blogService;
  
    @PostMapping("/posts")
    public void addBlog(@RequestBody Blog Blog) {
        blogService.addBlog(Blog);
    }
    
    @PutMapping("/posts/{id}")
    public void addBlog(@RequestBody Blog Blog, @PathVariable("id") long id) {
        blogService.editBlog(id, Blog);
    }
  
    @GetMapping("/posts")
    public HashSet<Blog> getAllBlog() {
        return blogService.findAllBlog();
    }
  
    @GetMapping("/posts/{id}")
    public Blog geBlogById(@PathVariable long id) {
        return blogService.findBlogByID(id);
    }
  
    @DeleteMapping("/posts")
    public void deleteBlog() {
        blogService.deleteAllData();
    }
  
    @DeleteMapping("/posts/{id}")
    public void deleteBlog(@PathVariable long id) {
        blogService.deleteBlog(id);
    }
  
  
    @GetMapping("/categories")
    public HashSet<Category> getAllCategories() {
        return blogService.findAllCategories();
    }
}