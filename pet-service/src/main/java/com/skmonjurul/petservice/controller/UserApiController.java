package com.skmonjurul.petservice.controller;

import com.skmonjurul.petservice.api.UserApi;
import com.skmonjurul.petservice.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserApiController implements UserApi {
    
    
    private final static Logger log = LoggerFactory.getLogger(UserApiController.class);
    
    
    @Override
    public ResponseEntity<User> createUser(User user) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    
    @Override
    public ResponseEntity<User> createUsersWithListInput(List<User> user) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    
    @Override
    public ResponseEntity<Void> deleteUser(String username) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    @Override
    public ResponseEntity<User> getUserByName(String username) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    @Override
    public ResponseEntity<String> loginUser(String username, String password) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    @Override
    public ResponseEntity<Void> logoutUser() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    @Override
    public ResponseEntity<Void> updateUser(String username, User user) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
