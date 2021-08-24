package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {
    public List<User> findAllByFirstName(String firstName);

    public List<User> findAllByFirstNameOrLastName(String firstName, String lastName);

    public User findByEmail(String email);

    public User findByMobileNo(String mobileNo);
}
