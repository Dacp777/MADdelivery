package com.maddelivery.maddelivery.repositorio;

import com.maddelivery.maddelivery.modelo.usuario;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public class usuarioRepositorio extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
}