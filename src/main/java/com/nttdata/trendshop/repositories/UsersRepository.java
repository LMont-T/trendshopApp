package com.nttdata.trendshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.trendshop.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

}
