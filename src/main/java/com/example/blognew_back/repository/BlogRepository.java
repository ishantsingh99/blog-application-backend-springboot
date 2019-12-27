package com.example.blognew_back.repository;


import com.example.blognew_back.dao.Blog;
import com.example.blognew_back.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {

    List<Blog> findAllByUserId(User user);

    String deleteByPostId(Long id);

    Blog getBlogByPostId(Long id);



}
