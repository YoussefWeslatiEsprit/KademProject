package tn.ey.tsd.kademproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Universite {
    @Id
    private int idUniversite;
    private String nomUniversie;
}
