package tn.ey.tsd.kademproject.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.ey.tsd.kademproject.entities.DetailEquipe;
import tn.ey.tsd.kademproject.repositories.DetailEquipeRepository;

@Service @AllArgsConstructor
public class IDetailEquipeServicesImp implements IDetailEquipeServices {
    private final DetailEquipeRepository detailEquipeRepository;

    @Override
    public DetailEquipe addDetailEquipe(DetailEquipe de) {
        return detailEquipeRepository.save(de);
    }

    @Override
    public void removeDetailEquipe(Integer id) {
        detailEquipeRepository.deleteById(id);
        
    }

    @Override
    public List<DetailEquipe> retrieveAllDetailEquipe() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe retrieveDetailEquipe(Integer id) {
        return detailEquipeRepository.findById(id).orElse(null);
    }

    @Override
    public DetailEquipe updateDetailEquipe(DetailEquipe de) {
        return detailEquipeRepository.save(de);
    }

    
}
