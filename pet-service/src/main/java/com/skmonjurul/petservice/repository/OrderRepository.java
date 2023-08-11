package com.skmonjurul.petservice.repository;


import com.skmonjurul.petservice.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository extends HashMapRepository<Order, Long> {

    public OrderRepository() {
        super(Order.class);
    }
    @Override
    <S extends Order> Long getEntityId(S order) {
        return order.getId();
    }


}
