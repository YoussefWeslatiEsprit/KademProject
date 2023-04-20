package tn.ey.tsd.kademproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idContrat;
    private LocalDate dateebutContrat;
    private LocalDate dateFinContrat;
    private Boolean achive;
    private int montantContrat;

    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    @ManyToOne
    @JsonIgnore
    Etudiant etudiant;

}
