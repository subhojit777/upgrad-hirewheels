package com.upgrad.hirewheels;

import com.upgrad.hirewheels.dao.RoleDao;
import com.upgrad.hirewheels.entities.User;
import com.upgrad.hirewheels.services.InitService;
import com.upgrad.hirewheels.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner{
    @Autowired
    @Qualifier(value = "initServiceImpl")
    private InitService initService;

    @Autowired
    @Qualifier(value = "userServiceImpl")
    private UserService userService;

    @Autowired
    private RoleDao roleDao;

    public void run(String... args) throws Exception {
        initService.start();

        User user = new User(2, "Subhojit", "Paul", "subhojit", "subhojit@mail.com", "123456789", roleDao.findByRoleName("User").get());
        this.userService.createUser(user);

        System.out.println(this.userService.getUser("subhojit@mail.com", "subhojit"));
        System.out.println(this.userService.getUser("subhojit@mail.com", "subhojit1"));
        System.out.println(this.userService.getUser("different@mail.com", "subhojit1"));
    }
}
