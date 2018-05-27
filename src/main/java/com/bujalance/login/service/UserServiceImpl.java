package com.bujalance.login.service;

import com.bujalance.login.model.User;
import com.bujalance.login.repository.RoleRepository;
import com.bujalance.login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(final UserRepository pUserRepository, final RoleRepository pRoleRepository, final BCryptPasswordEncoder pBCryptPasswordEncoder) {
        userRepository = pUserRepository;
        roleRepository = pRoleRepository;
        bCryptPasswordEncoder = pBCryptPasswordEncoder;
    }

    @Override
    public void save(final User pUser) {
        pUser.setPassword(bCryptPasswordEncoder.encode(pUser.getPassword()));
        pUser.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(pUser);
    }

    @Override
    public User findByUsername(final String pUsername) {
        return userRepository.findByUsername(pUsername);
    }

}
