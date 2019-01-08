package com.example.demofimkf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserRestController {

    @GetMapping("/rest/user")
    public List<User> getAllUser() {

        ArrayList<User> users = new ArrayList<User>();
        User u = new User();
        u.setName("sss");

        users.add(u);

        return users;
    }
}
