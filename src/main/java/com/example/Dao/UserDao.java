package com.example.Dao;

import com.example.Entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * Created by sscutaru on 1/25/2017.
 */
@Repository
@RequestMapping("/user")
public class UserDao {

    Collection<User> getAllUsers();

    User getUserById(int id);

    void removeUserById(int id);

    void updateUser(User user);

    void insertUserToDb(User user);
}
