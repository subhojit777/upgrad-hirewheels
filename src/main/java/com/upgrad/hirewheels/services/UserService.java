package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.User;

import java.util.Optional;

public interface UserService {
    public User createUser();

    public Optional<User> getUser(String email, String password);
}
