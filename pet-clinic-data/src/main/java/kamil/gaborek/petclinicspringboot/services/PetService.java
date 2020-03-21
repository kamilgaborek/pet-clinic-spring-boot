package kamil.gaborek.petclinicspringboot.services;

import kamil.gaborek.petclinicspringboot.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}

