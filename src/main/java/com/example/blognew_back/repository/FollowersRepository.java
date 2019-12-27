package com.example.blognew_back.repository;

import com.example.blognew_back.dao.Followers;
import com.example.blognew_back.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FollowersRepository extends JpaRepository<Followers, Long> {

    Object findAllByCurrentUserAndFollower(User currentUser, User follower);

    List<Followers> findAllByCurrentUser(User currentUser);

}
