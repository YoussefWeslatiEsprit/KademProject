package tn.ey.tsd.kademproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Departement {
    @Id
    private int idDepartement;
    private String nomDepartement;
}
