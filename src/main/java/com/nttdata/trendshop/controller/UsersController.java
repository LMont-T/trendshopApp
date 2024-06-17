package com.nttdata.trendshop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nttdata.trendshop.models.Users;
import com.nttdata.trendshop.services.UsersService;

@RestController
@RequestMapping("/trendshop")
public class UsersController {
    
    @Autowired
    private UsersService userService;

    @GetMapping("/getUsers")
    public List<Users> searchUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/getUser/{id}")
    public Optional<Users> getUsers(@PathVariable(value = "id") Integer id){
        return userService.getUser(id);
    }

    @PostMapping("/createUser")
    public void creaUtente(@RequestBody Users utente){
        userService.addUsers(utente);
    }



}