package com.nttdata.trendshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.trendshop.models.Users;
import com.nttdata.trendshop.services.UsersService;

@RestController
@RequestMapping("/trendshop")
public class UsersController {
    
    @Autowired
    private UsersService userService;

    @GetMapping("/searchUsers")
    public List<Users> searchUsers(){
    	return userService.findAllUsers();	
    }
    
}