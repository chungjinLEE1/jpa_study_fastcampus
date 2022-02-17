package com.example.jpa.repository;

import com.example.jpa.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Long> {


    void deleteAllInBatch(List<Users> allById);
}
