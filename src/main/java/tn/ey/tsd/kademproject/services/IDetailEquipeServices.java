package tn.ey.tsd.kademproject.services;

import java.util.List;

import tn.ey.tsd.kademproject.entities.DetailEquipe;

public interface IDetailEquipeServices {
    List<DetailEquipe> retrieveAllDetailEquipe();
    DetailEquipe addDetailEquipe (DetailEquipe de);
    DetailEquipe updateDetailEquipe (DetailEquipe de);
    DetailEquipe retrieveDetailEquipe (Integer id);
    void removeDetailEquipe(Integer id);
}
