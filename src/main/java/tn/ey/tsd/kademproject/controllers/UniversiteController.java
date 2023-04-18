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
import tn.ey.tsd.kademproject.entities.Universite;
import tn.ey.tsd.kademproject.services.IUniversiteServices;


@RestController @AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {
    private final IUniversiteServices universiteServices;

    @GetMapping("/getall")
    private List<Universite> retrieveAllUniversites(){
        return universiteServices.retrieveAllUniversites();
    };

    @PostMapping("/add")
    private Universite addUniversite (@RequestBody Universite u){
        return universiteServices.addUniversite(u);
    };

    @PutMapping("/update")
    private Universite updateUniversite (@RequestBody Universite u){
        return universiteServices.updateUniversite(u);
    };

    @GetMapping("/{idUniversite}")
    private Optional<Universite> retrieveUniversite (@PathVariable Integer idUniversite){
        return universiteServices.retrieveUniversite(idUniversite);
    };

}
