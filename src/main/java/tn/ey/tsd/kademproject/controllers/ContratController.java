package tn.ey.tsd.kademproject.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private IContratServices contratServices;

    @GetMapping("/retrieveAllContrats")
    List<Contrat> retrieveAllContrats(){
        return contratServices.retrieveAllContrats();
    };

    @PostMapping("/addContrat")
    private Contrat addContrat(@RequestBody Contrat ce){
        return contratServices.addContrat(ce);
    }
    @PutMapping("/updateContrat")
    private Contrat updateContrat(@RequestBody Contrat ce){
        return contratServices.updateContrat(ce);
    }
    @GetMapping("/retrieveContrat/{idcontart}")
    private Contrat retrieveContrat(@PathVariable Integer idContrat){
        return contratServices.retrieveContrat(idContrat);
    }
    @DeleteMapping("/removeContrat/{idcontart}")
    private void removeContrat(@PathVariable Integer idInteger){
        contratServices.removeContrat(idInteger);
    }



    
}

