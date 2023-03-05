package tn.ey.tsd.kademproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Departement {
    @Id
    private int idDepartement;
    private String nomDepartement;

    @OneToMany(mappedBy = "depart")
    @JsonIgnore
    List<Etudiant> etu;

}
