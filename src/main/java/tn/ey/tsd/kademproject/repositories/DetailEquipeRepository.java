package tn.ey.tsd.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.ey.tsd.kademproject.entities.Departement;

@Repository
public interface DetailEquipeRepository extends JpaRepository<Departement,Integer> {
}
