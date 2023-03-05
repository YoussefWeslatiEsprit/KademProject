package tn.ey.tsd.kademproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailEquipe {
    @Id
    int idDetailEquipe;
    int salle;
    String thematique;

    @OneToOne(mappedBy ="detailEquipe")
    Equipe equipe;

}
