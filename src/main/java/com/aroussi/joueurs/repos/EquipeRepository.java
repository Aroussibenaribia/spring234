package com.aroussi.joueurs.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.aroussi.joueurs.entities.Equipe;


@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long>{

}