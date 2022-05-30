package com.example.Proyecto01.repository;

import com.example.Proyecto01.model.AFP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource //Por Spring Data Rest. Crea API REST
public interface AFPRepository extends JpaRepository<AFP, Long> {
}
