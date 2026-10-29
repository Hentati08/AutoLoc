package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.IClientService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {

    private final IClientService clientService;

    @PostMapping
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    @PutMapping
    public Client modifierClient(@RequestBody Client client) {
        return clientService.modifierClient(client);
    }

    @GetMapping
    public List<Client> consulterClients() {
        return clientService.consulterClients();
    }

    @GetMapping("/getById/{id}")
    public Client consulterClientById(@PathVariable Long id) {
        return clientService.consulterClientById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void supprimerClientById(@PathVariable Long id) {
        clientService.supprimerClientById(id);
    }
}
