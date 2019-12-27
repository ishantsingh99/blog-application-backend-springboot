package com.example.blognew_back.service;

import com.example.blognew_back.dao.Blog;
import com.example.blognew_back.dao.Comment;
import com.example.blognew_back.dao.User;
import com.example.blognew_back.repository.BlogRepository;
import com.example.blognew_back.repository.CommentRepository;
import com.example.blognew_back.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private CommentRepository commentRepository;

    public Comment postComment(Comment comment, Long userId) {
        User currentUser = userRepository.findByUserId(userId);
        comment.setUser(currentUser);
        return commentRepository.save(comment);

    }

    public List<Comment> getCommentsOfParticularPost(Long id) {
        Blog currentBlog = blogRepository.getBlogByPostId(id);
        return commentRepository.findAllByBlog(currentBlog);
    }
}
