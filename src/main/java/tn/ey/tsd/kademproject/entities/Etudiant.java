package tn.ey.tsd.kademproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;


    @OneToMany(mappedBy="etudiant")
    List<Contrat> contrats;
    @ManyToMany(mappedBy = "etudiantList")
    @JsonIgnore
    List<Equipe> equipeList;
    @ManyToOne
    @JsonIgnore
    Departement depart;
}
