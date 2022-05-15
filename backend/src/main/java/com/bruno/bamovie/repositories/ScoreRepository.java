package com.bruno.bamovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.bamovie.entities.Score;
import com.bruno.bamovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
