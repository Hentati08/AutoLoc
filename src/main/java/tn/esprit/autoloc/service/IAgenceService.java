package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Agence;

import java.util.List;

public interface IAgenceService {

    Agence ajouterAgence(Agence agence);

    Agence modifierAgence(Agence agence);

    List<Agence> consulterAgences();

    Agence consulterAgenceById(Long id);

    void supprimerAgenceById(Long id);
}
