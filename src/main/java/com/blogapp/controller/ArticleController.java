package com.blogapp.controller;

import com.blogapp.Service.ArticleService;
import com.blogapp.entity.Article;
import com.blogapp.repository.ArticleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }
    @GetMapping
    public List<Article>getAllArticles(){
        return articleService.getAllArticles();
    }
    @PostMapping
    public Article createArticle(@RequestBody Article article){
        return articleService.createArticle(article);
    }
}
