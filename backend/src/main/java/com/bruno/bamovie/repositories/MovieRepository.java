package com.bruno.bamovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.bamovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
