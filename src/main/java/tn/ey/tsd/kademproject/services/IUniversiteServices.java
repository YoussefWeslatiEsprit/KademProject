package tn.ey.tsd.kademproject.services;

import java.util.List;

import tn.ey.tsd.kademproject.entities.Universite;

public interface IUniversiteServices {
    List<Universite> retrieveAllUniversites();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (Integer idUniversite);
}
