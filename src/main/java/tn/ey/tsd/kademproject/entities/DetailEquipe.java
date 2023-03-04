package tn.ey.tsd.kademproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DetailEquipe {
    @Id
    int idDetailEquipe;
    int salle;
    String thematique;
}
