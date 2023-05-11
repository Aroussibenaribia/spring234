package com.aroussi.joueurs.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.aroussi.joueurs.entities.Equipe;


public interface EquipeService {

    List <Equipe> findAll();
    
    Equipe saveEquipe(Equipe c);
    Equipe updateEquipe(Equipe c);
    void deleteEquipe(Equipe c);
     void deleteEquipeById(Long id);
     Equipe getEquipe (Long idEquipe);

	Page<Equipe> getAllEquipeParPage(int page, int size);

}