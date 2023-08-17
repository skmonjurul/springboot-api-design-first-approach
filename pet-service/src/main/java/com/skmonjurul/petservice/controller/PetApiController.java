package com.skmonjurul.petservice.controller;

import com.skmonjurul.petservice.api.PetApi;
import com.skmonjurul.petservice.model.ModelApiResponse;
import com.skmonjurul.petservice.model.Pet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PetApiController implements PetApi {
    
    private final static Logger log = LoggerFactory.getLogger(PetApiController.class);
    
    @Override
    public ResponseEntity<Pet> addPet(Pet pet) {
        log.info("adding pet");
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    
    @Override
    public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    
    @Override
    public ResponseEntity<List<Pet>> findPetsByStatus(String status) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    
    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(List<String> tags) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    
    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    
    @Override
    public ResponseEntity<Pet> updatePet(Pet pet) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    
    @Override
    public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    
    @Override
    public ResponseEntity<ModelApiResponse> uploadFile(Long petId, String additionalMetadata,
                                                       org.springframework.core.io.Resource body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
}
