package com.example.demofimkf;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    /**
     * Vytvoří uživatele
     * @param user
     */
    void createUser(User user);

    /**
     * Najde uživatele qqqq
     * @param id
     * @return instance uživatele
     */
    User findById(long id);

    List<User> findAll();
}
