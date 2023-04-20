package tn.ey.tsd.kademproject.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.ey.tsd.kademproject.entities.Departement;
import tn.ey.tsd.kademproject.repositories.DepartementRepository;

@Service @AllArgsConstructor
public class IDepartementServicesImp implements IDepartementServices {

    private final DepartementRepository departementRepository;
    @Override
    public Departement addDepartement(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public List<Departement> retrieveAllDepartements() {
       return departementRepository.findAll();
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {        
       return departementRepository.findById(idDepart).orElse(null);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return departementRepository.save(d);
    }
    
}
