package com.ciclo4proyecto.ciclo4.repository.crud;

import java.util.Optional;

import com.ciclo4proyecto.ciclo4.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);
}
