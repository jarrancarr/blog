package org.chexx.demo.service;
import java.sql.Time;
import java.util.HashSet;

import org.springframework.stereotype.Service;
import org.chexx.demo.modal.Blog;
import org.chexx.demo.modal.Category;

@Service
public class BlogService implements IBlogService{

    HashSet<Blog> blog = new HashSet<Blog>();
    HashSet<Category> category = new HashSet<Category>();

    @Override
    public HashSet<Blog> findAllBlog() {
        return blog;
    }

    @Override
    public Blog findBlogByID(long id) {        
        return blog.stream().filter(b -> b.getId() == id).findAny().orElse(null);
    }
    
    private Category findCategoryByID(long id) {        
        return category.stream().filter(b -> b.getId() == id).findAny().orElse(null);
    }

    @Override
    public void addBlog(Blog b) {
        b.setTimeStamp(new Time(System.currentTimeMillis()));
        Blog ele = findBlogByID(b.getId());
        if (ele == null) blog.add(b);
        else {
            blog.remove(ele);
            blog.add(b);
        }            
        if (findCategoryByID(b.getCategory().getId()) == null) category.add(b.getCategory());

    }

    @Override
    public void deleteAllData() {
        blog.clear();
        
    }

    @Override
    public void deleteBlog(long id) {
        Blog ele = findBlogByID(id);
        blog.remove(ele);
    }

    public void editBlog(long id, Blog b) {
        Blog ele = findBlogByID(id);
        if (ele == null) return;
        else {
            blog.remove(ele);
            b.setId(id);
            blog.add(b);
            if (findCategoryByID(b.getCategory().getId()) == null) category.add(b.getCategory());
        }
    }

    public HashSet<Category> findAllCategories() {
        return category;
    }
    
}