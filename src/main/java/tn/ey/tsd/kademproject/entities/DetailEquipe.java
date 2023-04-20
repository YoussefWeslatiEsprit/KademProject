package tn.ey.tsd.kademproject.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    int idDetailEquipe;
    int salle;
    String thematique;

    @OneToOne(mappedBy ="detailEquipe")
    Equipe equipe;

}
