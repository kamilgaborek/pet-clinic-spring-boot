package kamil.gaborek.petclinicspringboot.services;

import kamil.gaborek.petclinicspringboot.model.Owner;

interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}

