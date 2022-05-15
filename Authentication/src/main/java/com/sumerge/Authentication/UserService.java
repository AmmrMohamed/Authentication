package com.sumerge.Authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public int Validate(UserModel user) {
        List<User> users = userRepository.findAll();
        for (User UsersDB : users) {
            if (UsersDB.getEmail().equals(user.getEmail())) {
                if (UsersDB.getPassword().equals(user.getPassword())) {
                    return 1;
                } else {
                    return 2;
                }
            }
        }
        return 3;
    }

}
