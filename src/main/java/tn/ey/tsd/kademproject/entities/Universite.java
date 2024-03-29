package tn.ey.tsd.kademproject.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idUniversite;
    private String nomUniversie;

    @OneToMany
    List<Departement> departL;
}
