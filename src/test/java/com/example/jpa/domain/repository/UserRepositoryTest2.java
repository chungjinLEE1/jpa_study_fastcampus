package com.example.jpa.domain.repository;

import com.example.jpa.domain.Gender;
import com.example.jpa.domain.Users;
import com.example.jpa.repository.UserRepository;
import org.assertj.core.util.Lists;
import org.hibernate.criterion.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.time.LocalDateTime;
import java.util.List;

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

    @Test
    void select(){
//        System.out.println(userRepository.findByName("martin"));
//
//        System.out.println("findByEmail : " + userRepository.findByEmail("martin@naver.com"));
//        System.out.println("getByEmail : " + userRepository.getByEmail("martin@naver.com"));
//        System.out.println("readByEmail : " + userRepository.readByEmail("martin@naver.com"));
//        System.out.println("queryByEmail : " + userRepository.queryByEmail("martin@naver.com"));
//
//        System.out.println("streamByEmail : " + userRepository.streamByEmail("martin@naver.com"));
//        System.out.println("searchByEmail : " + userRepository.searchByEmail("martin@naver.com"));
//        System.out.println("findUserByEmail : " + userRepository.findUserByEmail( "martin@naver.com"));
//
//        System.out.println("findSomethingByEmail : " + userRepository.findSomethingByEmail( "martin@naver.com"));
//
//        System.out.println("findFirstByName : " + userRepository.findFirstByName("martin"));
//        System.out.println("findTop1ByName : " + userRepository.findTop1ByName("martin"));
//        System.out.println("findLast1ByName : " + userRepository.findLast1ByName("martin"));


        System.out.println("findByEmailAndName : " + userRepository.findByEmailAndName("martin@naver.com", "martin" ));

        System.out.println("findByEmailOrName : " + userRepository.findByEmailOrName("marting@naver.com", "dennis"));
        System.out.println("findByCreatedAtAfter : " + userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)));
        System.out.println("findByCreatedAtGreaterThan" + userRepository.findByCreatedAtGreaterThanAnd(LocalDateTime.now().minusDays(1L)));
        System.out.println("findByCreatedAtGreaterThanEquals" + userRepository.findByCreatedAtGreaterThanEquals(LocalDateTime.now().minusDays(1L)));

        System.out.println("findByCreatedAtBetween" + userRepository.findByCreatedAtBetween(LocalDateTime.now().minusDays(1L), LocalDateTime.now().plusDays(1L)));
        System.out.println("findByBetween" + userRepository.findByIdBetween(1L, 3L));
        System.out.println("findByIdGreaterThanEqualsAndIdLessThanEquals" + userRepository.findByIdGreaterThanEqualsAndIdLessThanEquals(1L, 3L));


        System.out.println("findByIdIsNotNull" + userRepository.findByIdIsNotNull());
        System.out.println("findByAddressIsNotEmpty" + userRepository.findByAddressIsNotEmpty());


        System.out.println("findByNameIn" + userRepository.findByNameIn(Lists.newArrayList("martin", "dennis")));

        System.out.println("findByNameStartingWith" + userRepository.findByNameStartingWith("mar"));
        System.out.println("findByNameEndingWith" + userRepository.findByNameEndingWith("tin"));
        System.out.println("findByNameContains" + userRepository.findByNameContains("art"));


        System.out.println("findByNameLike" + userRepository.findByNameLike("%art%"));


    }
    @Test
    void pageingSortingTest(){
        System.out.println("findTop1ByName2 : " + userRepository.findTop1ByName2("martin"));
        System.out.println("findTop1ByName : " + userRepository.findLast1ByName("martin"));
        System.out.println("findTop1ByNameOrderByIdDesc : " + userRepository.findTop1ByNameOrderByIdDesc("martin"));
        System.out.println("findFirstByNameOrderByInDesc : " + userRepository.findFirstByNameOrderByInDescEmailAsc("martin"));
        System.out.println("findFirstByNameWithSortParams: " + userRepository.findFirstByName("martin", Sort.by(Sort.Order.desc("id"))));

        System.out.println("findByName: " + userRepository.findByName("martin", PageRequest.of(0, 1, Sort.by((List<Sort.Order>) Order.desc("id")))));

    }

    @Test
    void insertAndUpdateTest(){
        Users user = new Users();
        user.setName("martin");
        user.setEmail("martin@naver.com");

        userRepository.save(user);

        Users user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user2.setName("martintintintin");

        userRepository.save(user2);

    }


    @Test
    void enumTest(){
        Users user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setGender(Gender.MALE);

        userRepository.save(user);

        userRepository.findAll().forEach(System.out::println);


        System.out.println(userRepository.findRawRecord().get("gender"));
    }
}