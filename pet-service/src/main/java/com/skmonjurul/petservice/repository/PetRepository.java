package com.skmonjurul.petservice.repository;


import com.skmonjurul.petservice.model.Pet;
import org.springframework.stereotype.Repository;

@Repository
public class PetRepository extends HashMapRepository<Pet, Long> {

    public PetRepository() {
        super(Pet.class);
    }


    @Override
    <S extends Pet> Long getEntityId(S pet) {
        return pet.getId();
    }
}
