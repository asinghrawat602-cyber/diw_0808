package com.example.deeputsav.repository;

import model.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VisitorRepository
        extends JpaRepository<Visitor, Long> {

    Optional<Visitor> findByVisitorToken(String visitorToken);

    long count();
}
