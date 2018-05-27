package com.bujalance.login.service;

import com.bujalance.login.model.User;

public interface UserService {

    void save(User pUser);

    User findByUsername(String pUsername);
}
