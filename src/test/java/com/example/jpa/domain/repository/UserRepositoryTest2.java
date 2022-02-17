package com.example.jpa.domain.repository;

import com.example.jpa.domain.Users;
import com.example.jpa.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

@SpringBootTest
class UserRepositoryTest2 {
    @Autowired
    private UserRepository userRepository;

//    @Test
//    void crud(){
////        ExampleMatcher matcher = ExampleMatcher.matching()
////                .withIgnorePaths("name")
////                .withMatcher("email", endsWith());
//
////        Example<Users> example = Example.of(new Users("jin", "toss.co.kr"), matcher);
//
//                Example<Users> example = Example.of(new Users("jin", "toss.co.kr"));
//
//        userRepository.findAll(example).forEach(System.out::println);
//
//    }
    @Test
    void crud(){
        Users user = new Users();
        user.setEmail("slow");

        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("email", contains());
        Example<Users> example = Example.of(user, matcher);

        userRepository.findAll(example).forEach(System.out::println);
    }

}