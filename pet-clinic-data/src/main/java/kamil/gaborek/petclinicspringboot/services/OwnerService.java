package kamil.gaborek.petclinicspringboot.services;

import kamil.gaborek.petclinicspringboot.model.Owner;

import java.util.Set;

interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}

