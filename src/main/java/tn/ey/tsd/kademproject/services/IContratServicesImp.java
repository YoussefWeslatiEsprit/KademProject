package tn.ey.tsd.kademproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tn.ey.tsd.kademproject.entities.Contrat;
import tn.ey.tsd.kademproject.repositories.ContratRepository;

@Service
@RequiredArgsConstructor
public class IContratServicesImp implements IContratServices{
    private final ContratRepository contratRepository;

    @Override
    public List<Contrat> retrieveAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return contratRepository.save(ce);
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return contratRepository.save(ce);
    }

    @Override
    public Optional<Contrat> retrieveContrat(Integer idContrat) {
       return contratRepository.findById(idContrat);
    }

    @Override
    public void removeContrat(Integer idContrat) {
        contratRepository.deleteById(idContrat);
    }

    

    
}
