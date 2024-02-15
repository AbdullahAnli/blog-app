package com.blogapp.controller;

import com.blogapp.Service.CommentService;
import com.blogapp.entity.Comment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/{articleId}")
    public List<Comment>getCommentsByArticleId(@PathVariable Long articleId){
        return commentService.getCommentsByArticleId(articleId);
    }

    @PostMapping
    public Comment createComment(@RequestBody Comment comment){
        return commentService.createComment(comment);
    }
}
