package com.example.jpa.domain.repository;

import com.example.jpa.domain.Users;
import com.example.jpa.repository.UserRepository;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
//    @Transactional
    void crud(){
//        userRepository.save(new Users());
//        userRepository.flush();

//        List<Users> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
//        List<Users> users = userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L));
//        users.forEach(System.out::println);

//        Users user1 = new Users("Jack", "jack@naver.com");
//        Users user2 = new Users("Steve", "Steve@naver.com");
//        userRepository.saveAll(Lists.newArrayList(user1, user2));
//        List<Users> users = userRepository.findAll();
//        users.forEach(System.out::println);


//        Users users = userRepository.getOne(1L);
//        System.out.println(users);


//        Users user = userRepository.findById(1L).orElse(null);
//        System.out.println(user);

//        userRepository.save(new Users("new martin", "martin@naver.com"));
//        userRepository.flush();
//        userRepository.findAll().forEach(System.out::println);


//        long count = userRepository.count();
//        System.out.println(count);

//        boolean exists = userRepository.existsById(1L);
//        System.out.println(exists);


//        userRepository.delete(userRepository.findById(1L).orElse(null)); // IllegalArgumentsException
//        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
//        userRepository.deleteById(1L);
//        userRepository.findAll().forEach(System.out::println);

//        userRepository.deleteAll();
//        userRepository.findAll().forEach(System.out::println);

//        userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L, 3L)));
//        userRepository.findAll().forEach(System.out::println);

//        userRepository.deleteAllInBatch(userRepository.findAllById(Lists.newArrayList(1L, 3L)));
//        userRepository.findAll().forEach(System.out::println);

//        Page<Users> users = userRepository.findAll(PageRequest.of(1, 3));
//        System.out.println("page : " + users);
//        System.out.println("totalElement : " + users.getTotalElements());
//        System.out.println("totalPages : " + users.getTotalPages());
//        System.out.println("numberOfElements : " + users.getNumberOfElements());
//        System.out.println("sort : " + users.getSort());
//        System.out.println("size : " + users.getSize());
//
//
//        users.getContent().forEach(System.out::println);


    }

}