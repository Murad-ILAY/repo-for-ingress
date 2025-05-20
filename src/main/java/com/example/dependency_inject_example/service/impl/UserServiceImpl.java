package com.example.dependency_inject_example.service.impl;

import com.example.dependency_inject_example.model.User;
import com.example.dependency_inject_example.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private static final List<User> users = new ArrayList<>();

    static{
    users.add(new User(1L,"Farid"));
    users.add(new User(2L,"Shahin"));
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
