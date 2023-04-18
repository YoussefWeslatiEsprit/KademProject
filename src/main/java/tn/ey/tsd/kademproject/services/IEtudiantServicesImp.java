package tn.ey.tsd.kademproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.ey.tsd.kademproject.entities.Etudiant;
import tn.ey.tsd.kademproject.repositories.EtudiantRepository;

@Service @AllArgsConstructor
public class IEtudiantServicesImp implements IEtudiantServices{
    private final EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
        
    }

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Optional<Etudiant> retrieveEtudiant(Integer idEtudiant) {
        return etudiantRepository.findById(idEtudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

   
         
}
