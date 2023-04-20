package tn.ey.tsd.kademproject.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.ey.tsd.kademproject.entities.Universite;
import tn.ey.tsd.kademproject.services.IUniversiteServices;


@RestController @AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {
    @Autowired
    private IUniversiteServices universiteServices;

    @GetMapping("/retrieveAllUniversites")
    private List<Universite> retrieveAllUniversites(){
        return universiteServices.retrieveAllUniversites();
    };

    @PostMapping("/addUniversite")
    private Universite addUniversite (@RequestBody Universite u){
        return universiteServices.addUniversite(u);
    };

    @PutMapping("/updateUniversite")
    private Universite updateUniversite (@RequestBody Universite u){
        return universiteServices.updateUniversite(u);
    };

    @GetMapping("/retrieveUniversite/{idUniversite}")
    private Universite retrieveUniversite (@PathVariable Integer idUniversite){
        return universiteServices.retrieveUniversite(idUniversite);
    };

}
