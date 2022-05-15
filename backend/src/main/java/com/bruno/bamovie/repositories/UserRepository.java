package com.bruno.bamovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.bamovie.entities.Score;
import com.bruno.bamovie.entities.ScorePK;
import com.bruno.bamovie.entities.User;

public interface UserRepository extends JpaRepository<User , Long> {

	User findByEmail(String email);
}
