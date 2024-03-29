package tn.ey.tsd.kademproject.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.ey.tsd.kademproject.entities.Equipe;
import tn.ey.tsd.kademproject.repositories.EquipeRepository;

@Service @AllArgsConstructor
public class IEquipeServicesImp implements IEquipeServices {
    private final EquipeRepository equipeRepository;

    @Override
    public Equipe addEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return equipeRepository.findById(idEquipe).orElse(null);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
       return equipeRepository.save(e);
    }
    
}
