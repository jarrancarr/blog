package org.chexx.demo.modal;

import java.sql.Time;

public class Blog {
  
    private long id;
    private String content;
    private String title;
    private Category category;
    private Time timeStamp;
  
    public Blog() {
        super();
    }
    public Blog(long id, String content, String title, Category category, Time timeStamp) {
        super();
        this.id = id;
        this.content = content;
        this.category = category;
        this.timeStamp = timeStamp;
        this.title = title;
    }
  
    public long getId() {
        return id;
    }
  
    public void setId(long id) {
        this.id = id;
    }
  
    public String getContent() {
        return content;
    }
  
    public void setContent(String content) {
        this.content = content;
    }
  
    public String getTitle() {
        return title;
    }
  
    public void setTitle(String title) {
        this.title = title;
    }
  
    public Category getCategory() {
        return category;
    }
  
    public void setCategory(Category category) {
        this.category = category;
    }
  
    public Time getTimeStamp() {
        return timeStamp;
    }
  
    public void setTimeStamp(Time timeStamp) {
        this.timeStamp = timeStamp;
    }
  
}