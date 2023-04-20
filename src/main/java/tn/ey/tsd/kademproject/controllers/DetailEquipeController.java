package tn.ey.tsd.kademproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.ey.tsd.kademproject.entities.DetailEquipe;
import tn.ey.tsd.kademproject.services.IDetailEquipeServices;

@RestController
@RequestMapping("/detailEquipe")
@AllArgsConstructor
public class DetailEquipeController {

    @Autowired
    private IDetailEquipeServices detailEquipeServices;

    @PostMapping("/addDetailEquipe")
    private DetailEquipe addDetailEquipe(@RequestBody DetailEquipe de) {
        return detailEquipeServices.addDetailEquipe(de);
    }

    @DeleteMapping("/removeDetailEquipe/{id}")
    private void removeDetailEquipe(@PathVariable Integer id) {
        detailEquipeServices.removeDetailEquipe(id);
    }

    @GetMapping("/retrieveAllDetailEquipe")
    private List<DetailEquipe> retrieveAllDetailEquipe() {
        return detailEquipeServices.retrieveAllDetailEquipe();
    }

    @GetMapping("/retrieveDetailEquipe/{id}")
    private DetailEquipe retrieveDetailEquipe(@PathVariable Integer id) {
        return detailEquipeServices.retrieveDetailEquipe(id);
    }

    @PostMapping("/updateDetailEquipe")
    private DetailEquipe updateDetailEquipe(@RequestBody DetailEquipe de) {
        return detailEquipeServices.updateDetailEquipe(de);
    }
    
}
