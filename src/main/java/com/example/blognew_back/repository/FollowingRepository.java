package com.example.blognew_back.repository;

import com.example.blognew_back.dao.Following;
import com.example.blognew_back.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FollowingRepository extends JpaRepository<Following, Long> {

    Object findAllByCurrentUserAndFollowing(User currentUser, User following);

    List<Following> findAllByCurrentUser(User currentUser);
}
