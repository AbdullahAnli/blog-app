package com.blogapp.Service;

import com.blogapp.entity.Comment;
import com.blogapp.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;


    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    public List<Comment>getCommentsByArticleId(Long articleId){
        return commentRepository.findByArticleId(articleId);
    }
    public Comment createComment(Comment comment){
        return commentRepository.save(comment);
    }
}
