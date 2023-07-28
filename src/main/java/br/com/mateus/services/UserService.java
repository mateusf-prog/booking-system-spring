package br.com.mateus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mateus.models.User;
import br.com.mateus.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // register user
    public String userRegister(User user) {
        userRepository.save(user);
        return "Success register!";
    }

    // delete user
    public String deleteUserById(long id) {
        userRepository.deleteById(id);
        return "Success delete!";
    }

    // update user
    public String updateUser(User user) {
        userRepository.save(user);
        return "Success update!";
    }

    
}
