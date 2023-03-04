package tn.ey.tsd.kademproject.entities;

import lombok.*;
import javax.persistence.*;

import java.util.List;


@Entity
public class Etudiant {
    @Id
    private int idEtudiant;
    private String prenomE;
    private String nomE;
    private Option option;

}
