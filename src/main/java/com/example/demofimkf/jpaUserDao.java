package com.example.demofimkf;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class jpaUserDao implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void createUser(User user) {

    }

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
     /*   em.createQuery("select  from User e",
                User.class).getResultList();*/
     return null;
    }
}
