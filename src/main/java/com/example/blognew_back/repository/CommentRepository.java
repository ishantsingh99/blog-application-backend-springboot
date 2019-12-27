package com.example.blognew_back.repository;

import com.example.blognew_back.dao.Blog;
import com.example.blognew_back.dao.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByBlog(Blog blog);
}
