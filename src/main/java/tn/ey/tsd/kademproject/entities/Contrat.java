package tn.ey.tsd.kademproject.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Contrat {
    @Id
    private int idContrat;
    private LocalDate dateebutContrat;
    private LocalDate dateFinContrat;
    private Specialite specialite;
    private Boolean achive;
    private int montantContrat;

}
