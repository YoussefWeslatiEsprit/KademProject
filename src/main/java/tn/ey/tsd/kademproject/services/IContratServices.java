package tn.ey.tsd.kademproject.services;

import java.util.List;

import tn.ey.tsd.kademproject.entities.Contrat;

public interface IContratServices {
    List<Contrat> retrieveAllContrats();
    Contrat updateContrat (Contrat ce);
    Contrat addContrat (Contrat ce);
    Contrat retrieveContrat (Integer idContart);
    void removeContrat(Integer idContrat);
}
