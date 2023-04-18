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

import lombok.RequiredArgsConstructor;
import tn.ey.tsd.kademproject.entities.Contrat;
import tn.ey.tsd.kademproject.services.IContratServices;

@RestController  
@RequestMapping("/contrat")
@RequiredArgsConstructor
public class ContratController {
    private final IContratServices contratServices;

    @GetMapping("/getall")
    List<Contrat> retrieveAllContrats(){
        return contratServices.retrieveAllContrats();
    };

    @PostMapping("/add")
    private Contrat addContrat(@RequestBody Contrat ce){
        return contratServices.addContrat(ce);
    }
    @PutMapping("/update")
    private Contrat upContrat(@RequestBody Contrat ce){
        return contratServices.updateContrat(ce);
    }
    @GetMapping("/{idcontart}")
    private Optional<Contrat> retrieveContrat(@PathVariable Integer idContrat){
        return contratServices.retrieveContrat(idContrat);
    }
    @DeleteMapping("/{idcontart}")
    private void removeContrat(@PathVariable Integer idInteger){
        contratServices.removeContrat(idInteger);
    }



    
}

