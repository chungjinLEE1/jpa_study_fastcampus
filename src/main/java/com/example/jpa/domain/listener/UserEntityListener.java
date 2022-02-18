package com.example.jpa.domain.listener;

import com.example.jpa.domain.UserHistory;
import com.example.jpa.domain.Users;
import com.example.jpa.repository.UserHistoryRepository;
import com.example.jpa.support.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

//@Component
public class UserEntityListener {

//    @Autowired
//    private UserHistoryRepository userHistoryRepository;

    @PrePersist
    @PreUpdate
    public void prePersistAndPreUpdate(Object o ){
        UserHistoryRepository userHistoryRepository = BeanUtils.getBean(UserHistoryRepository.class);

        Users user = (Users) o;

        UserHistory userHistory = new UserHistory();
        userHistory.setUserId(user.getId());
        userHistory.setUserName(user.getName());
        userHistory.setEmail(user.getEmail());

        userHistoryRepository.save(userHistory);
    }
}
