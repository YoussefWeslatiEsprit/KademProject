package tn.ey.tsd.kademproject.services;

import java.util.List;
import java.util.Optional;

import tn.ey.tsd.kademproject.entities.Equipe;

public interface IEquipeServices {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e); // ajouter l’équipe avec son détail

    Equipe updateEquipe (Equipe e);

    Optional<Equipe> retrieveEquipe (Integer idEquipe);
}
