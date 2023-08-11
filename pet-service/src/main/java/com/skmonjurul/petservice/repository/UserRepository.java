package com.skmonjurul.petservice.repository;


import com.skmonjurul.petservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends HashMapRepository<User, Long>{


    public UserRepository() {
        super(User.class);
    }

    @Override
    <S extends User> Long getEntityId(S user) {
        return user.getId();
    }
}
