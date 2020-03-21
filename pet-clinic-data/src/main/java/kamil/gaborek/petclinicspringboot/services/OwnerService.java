package kamil.gaborek.petclinicspringboot.services;

import kamil.gaborek.petclinicspringboot.model.Owner;

import java.util.Set;

interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}

