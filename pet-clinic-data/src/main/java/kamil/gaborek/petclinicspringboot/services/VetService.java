package kamil.gaborek.petclinicspringboot.services;

import kamil.gaborek.petclinicspringboot.model.Vet;

import java.util.Set;

interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
