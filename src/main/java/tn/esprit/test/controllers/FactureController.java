package tn.esprit.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.entities.Facture;
import tn.esprit.test.services.IServiceFacture;

import java.util.List;

@RestController
@RequestMapping("/facture")
public class FactureController {

    @Autowired
    IServiceFacture iServiceFacture;

    @GetMapping("getAll")
    public List<Facture> retrieveAllFactures(){
        return iServiceFacture.retrieveAllFactures();
    }
    @PutMapping("/cancel/{id}")
    public void cancelFacture(@PathVariable Long id){
        iServiceFacture.cancelFacture(id);
    }
    @GetMapping("getone/{id}")
    public Facture retrieveFacture(@PathVariable Long id){
        return iServiceFacture.retrieveFacture(id);
    }

    @PostMapping("/add")
    public Facture addFacture(@RequestBody Facture f) {
        return iServiceFacture.addFacture(f);
    }

    @GetMapping("/getbyclient/{idClient}")
    public List<Facture> getFacturesByClient(@PathVariable Long idClient){
        return iServiceFacture.getFacturesByClient(idClient);
    }
    @PostMapping("/addSe/{idClient}")
    Facture addFacture2(@RequestBody Facture f,@PathVariable Long idClient){
        return iServiceFacture.addFacture2(f,idClient);
    }
}
