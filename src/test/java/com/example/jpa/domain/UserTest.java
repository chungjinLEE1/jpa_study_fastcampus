package com.example.jpa.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;


class UserTest extends Object{



   @Test
    void test(){
       Users user = new Users();
       user.setEmail("podong@toss.co.kr");
       user.setName("podong");

       Users user1 = new Users(null, "podong", "podong@toss.co.kr", LocalDateTime.now(), LocalDateTime.now());
       Users user2 = new Users(null, "podong2", "podong@toss.kr", LocalDateTime.now(), LocalDateTime.now());

       Users user3 = Users.builder()
                       .name("podong3")
                               .email("podong3@toss.co.kr")
                                       .build();



      System.out.println(user1);
      System.out.println(user2);
      System.out.println(user3);
       System.out.println(user.toString());
   }

}