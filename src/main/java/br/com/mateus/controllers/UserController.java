package br.com.mateus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mateus.models.User;
import br.com.mateus.services.UserService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/registerUser")
    public String registerUser(@RequestBody User user) {
        return userService.userRegister(user);
    }


    @DeleteMapping("/deleteUser/{id}")
    public String deleteUserById(@PathVariable long id) {
        return userService.deleteUserById(id);
    }

    @PostMapping("/updateUser")
    public String updateUser(@Valid @RequestBody User user) {
        return userService.updateUser(user);
    }
}
