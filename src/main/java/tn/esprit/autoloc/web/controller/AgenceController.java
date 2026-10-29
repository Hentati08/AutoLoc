package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agence")
public class AgenceController {

    private final IAgenceService agenceService;

    @PostMapping
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);
    }

    @PutMapping
    public Agence modifierAgence(@RequestBody Agence agence) {
        return agenceService.modifierAgence(agence);
    }

    @GetMapping
    public List<Agence> consulterAgences() {
        return agenceService.consulterAgences();
    }

    @GetMapping("/getById/{id}")
    public Agence consulterAgenceById(@PathVariable Long id) {
        return agenceService.consulterAgenceById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void supprimerAgenceById(@PathVariable Long id) {
        agenceService.supprimerAgenceById(id);
    }
}
