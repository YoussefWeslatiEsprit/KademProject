package tn.ey.tsd.kademproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Equipe {
    @Id
    private int idEquipe;
    private String nomEquipe;
    private Niveau niveau;
}
