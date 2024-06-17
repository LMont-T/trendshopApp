package com.nttdata.trendshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.trendshop.models.Users;
import com.nttdata.trendshop.repositories.UsersRepository;

@Service
public class UsersService {

	@Autowired
    private UsersRepository usersRepository;
	
	
	public List<Users> findAllUsers() {
        return usersRepository.findAll();
    }

    public void addUsers(Users utente){
        usersRepository.save(utente);
    }

    public Optional<Users> getUser(Integer id){
        return usersRepository.findById(id);
    }
}
