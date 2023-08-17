package com.skmonjurul.petservice.controller;

import com.skmonjurul.petservice.api.StoreApi;
import com.skmonjurul.petservice.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class StoreApiController implements StoreApi {
    
    private final static Logger log = LoggerFactory.getLogger(StoreApiController.class);
    
    @Override
    public ResponseEntity<Void> deleteOrder(Long orderId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    @Override
    public ResponseEntity<Map<String, Integer>> getInventory() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    @Override
    public ResponseEntity<Order> getOrderById(Long orderId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    @Override
    public ResponseEntity<Order> placeOrder(Order order) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
