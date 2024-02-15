package com.blogapp.entity;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    @ManyToOne
    @JoinColumn(name = "article_id",nullable = false)
    private Article article;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content=content;
    }
    public Article getArticle(){
        return article;
    }
    public void setArticle(Article article){
        this.article=article;
    }

}
