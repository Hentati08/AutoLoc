package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.IContratService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contrat")
public class ContratController {

    private final IContratService contratService;

    @PostMapping
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.ajouterContrat(contrat);
    }

    @PutMapping
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return contratService.modifierContrat(contrat);
    }

    @GetMapping
    public List<Contrat> consulterContrats() {
        return contratService.consulterContrats();
    }

    @GetMapping("/getById/{id}")
    public Contrat consulterContratById(@PathVariable Long id) {
        return contratService.consulterContratById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void supprimerContratById(@PathVariable Long id) {
        contratService.supprimerContratById(id);
    }
}
