package com.example.Springpractice.Service;

import com.example.Springpractice.Entity.User;

public interface UserService {
    User getUserById(Long id);

    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);

}
