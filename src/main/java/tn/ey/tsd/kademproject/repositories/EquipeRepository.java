package tn.ey.tsd.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.ey.tsd.kademproject.entities.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
}
