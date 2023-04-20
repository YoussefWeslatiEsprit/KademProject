package tn.ey.tsd.kademproject.services;

import java.util.List;

import tn.ey.tsd.kademproject.entities.Departement;

public interface IDepartementServices {
    List<Departement> retrieveAllDepartements();
    Departement addDepartement (Departement d);
    Departement updateDepartement (Departement d);
    Departement retrieveDepartement (Integer idDepart);
}
