package tn.ey.tsd.kademproject.services;

import java.util.List;
import java.util.Optional;

import tn.ey.tsd.kademproject.entities.Etudiant;

public interface IEtudiantServices {
    List<Etudiant> retrieveAllEtudiants();
    Etudiant addEtudiant (Etudiant e);
    Etudiant updateEtudiant (Etudiant e);
    Optional<Etudiant> retrieveEtudiant(Integer idEtudiant);
    void removeEtudiant(Integer idEtudiant);
}
