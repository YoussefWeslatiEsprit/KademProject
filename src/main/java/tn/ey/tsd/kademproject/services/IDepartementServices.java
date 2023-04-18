package tn.ey.tsd.kademproject.services;

import java.util.List;
import java.util.Optional;

import tn.ey.tsd.kademproject.entities.Departement;

public interface IDepartementServices {
    List<Departement> retrieveAllDepartements();
    Departement addDepartement (Departement d);
    Departement updateDepartement (Departement d);
    Optional<Departement> retrieveDepartement (Integer idDepart);
}
