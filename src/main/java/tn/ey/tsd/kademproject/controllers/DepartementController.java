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

import lombok.RequiredArgsConstructor;
import tn.ey.tsd.kademproject.entities.Departement;
import tn.ey.tsd.kademproject.services.IDepartementServices;

@RestController
@RequestMapping("/departement")
@RequiredArgsConstructor
public class DepartementController {
    @Autowired
    private IDepartementServices departementServices;

    @GetMapping("/retrieveAllDepartements")
    private List<Departement> retrieveAllDepartements(){
        return departementServices.retrieveAllDepartements();
    };

    @PostMapping("/addDepartement")
    private Departement addDepartement(@RequestBody Departement d){
        return departementServices.addDepartement(d);
    };

    @PutMapping("/updateDepartement")
    private Departement updateDepartement(@RequestBody Departement d){
        return departementServices.updateDepartement(d);
    };

    @GetMapping("/retrieveDepartement/{idDepart}")
    private Departement retrieveDepartement (@PathVariable Integer idDepart){
        return departementServices.retrieveDepartement(idDepart);
    };
}
