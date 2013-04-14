package com.sandzhang.toywiki.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandzhang.toywiki.core.dao.UserDAO;
import com.sandzhang.toywiki.core.entity.User;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public User findUserById(Integer id) {
        return userDAO.findUserById(id);
    }

    public void regist(User user) {
        userDAO.insert(user);
    }

}
