package pds.aia.gss_backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pds.aia.gss_backend.entities.User;
import pds.aia.gss_backend.services.UserService;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/api/user" , produces = "application/json")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping(value = "/api/users" ,produces = "application/json")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping(value = "/api/user/{id}" ,produces = "application/json")
    public User getUser(@PathVariable Long id){
        Optional<User> userOptional = userService.getUser(id);
        return userOptional.isPresent()? userOptional.get() : null;
    }
}
