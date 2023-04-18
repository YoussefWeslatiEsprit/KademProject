package tn.ey.tsd.kademproject.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.ey.tsd.kademproject.entities.Equipe;
import tn.ey.tsd.kademproject.services.IEquipeServices;

@RestController
@RequestMapping("/equipe")
@AllArgsConstructor
public class EquipeController {
    private IEquipeServices equipeServices;
    
    @GetMapping("/getall")
    private List<Equipe> retrieveAllEquipes(){
        return equipeServices.retrieveAllEquipes();
    };
    
    @PostMapping("/add")
    private Equipe addEquipe (@RequestBody Equipe e){
        return equipeServices.addEquipe(e);
    };

    @PutMapping
    private Equipe updateEquipe (@RequestBody Equipe e){
        return equipeServices.updateEquipe(e);
    };

    @GetMapping("/{idequipe}")
    private Optional<Equipe> retrieveEquipe (@PathVariable Integer idEquipe){
        return equipeServices.retrieveEquipe(idEquipe);
    };
}
