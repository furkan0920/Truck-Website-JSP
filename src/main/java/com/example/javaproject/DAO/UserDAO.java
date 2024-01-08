package com.example.javaproject.DAO;

import com.example.javaproject.entity.User;

public interface UserDAO {
    public boolean userRegister (User user);
    public User login(String email,String password);

}
