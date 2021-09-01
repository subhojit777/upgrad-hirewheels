package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.UserDao;
import com.upgrad.hirewheels.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User createUser() {
        return null;
    }

    @Override
    public Optional<User> getUser(String email, String password) {
        Optional<User> userOptional = this.userDao.findByEmail(email);

        if (userOptional.isEmpty()) {
            System.out.println("user not Registered");
            return Optional.empty();
        }

        User user = userOptional.get();
        String userPassword = user.getPassword();

        if (!Objects.equals(password, userPassword)) {
            System.out.println("Unauthorized User");
            return Optional.empty();
        }

        return Optional.of(user);
    }
}
