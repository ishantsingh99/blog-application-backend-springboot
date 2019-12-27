package com.example.blognew_back.repository;


import com.example.blognew_back.dao.MyGroup;
import com.example.blognew_back.dao.MyGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<MyGroup, Long> {
}

