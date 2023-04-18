package tn.ey.tsd.kademproject.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.ey.tsd.kademproject.entities.Etudiant;
import tn.ey.tsd.kademproject.services.IEtudiantServices;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    private final IEtudiantServices etudiantServices;

    @GetMapping("/getall")
    private List<Etudiant> retrieveAllEtudiants(){
        return etudiantServices.retrieveAllEtudiants();
    };

    @PostMapping("/add")
    private Etudiant addEtudiant (@RequestBody Etudiant e){
        return etudiantServices.addEtudiant(e);
    };
    
    @PutMapping("/update")
    private Etudiant updateEtudiant (@RequestBody Etudiant e){
        return etudiantServices.updateEtudiant(e);
    };

    @GetMapping("/{idEtudiant}")
    private Optional<Etudiant> retrieveEtudiant(@PathVariable Integer idEtudiant){
        return etudiantServices.retrieveEtudiant(idEtudiant);
    };

    @DeleteMapping("/{idEtudiant}")
    private void removeEtudiant(@PathVariable Integer idEtudiant){
        etudiantServices.removeEtudiant(idEtudiant);
    };
    
}
