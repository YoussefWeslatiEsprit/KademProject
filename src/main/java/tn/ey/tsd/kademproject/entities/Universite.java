package tn.ey.tsd.kademproject.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Universite {
    @Id
    private int idUniversite;
    private String nomUniversie;

    @OneToMany
    List<Departement> departL;
}
