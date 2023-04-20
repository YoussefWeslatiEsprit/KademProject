package tn.ey.tsd.kademproject.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.ey.tsd.kademproject.entities.Universite;
import tn.ey.tsd.kademproject.repositories.UniversiteRepository;

@Service @AllArgsConstructor
public class IUniversiteServicesImp implements IUniversiteServices{
    private final UniversiteRepository universiteRepository;

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }
    
}
