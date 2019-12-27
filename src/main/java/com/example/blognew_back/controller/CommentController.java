package com.example.blognew_back.controller;

import com.example.blognew_back.dao.Comment;
import com.example.blognew_back.service.BlogService;
import com.example.blognew_back.service.CommentService;
import com.example.blognew_back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private UserService userService;

    @Autowired
    private BlogService blogService;

    @PostMapping("/addComment")
    @ResponseBody
    public Comment addComment(@RequestBody Comment comment, Principal principal) {
        return commentService.postComment(comment, userService.getUserId(principal));

    }

    @GetMapping("/allComments/{id}")
    public List<Comment> getAllComments(@PathVariable Long id) { return commentService.getCommentsOfParticularPost(id); }

}
