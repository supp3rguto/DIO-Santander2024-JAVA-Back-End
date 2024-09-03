package com.johndeere.tractors.repository;

import com.johndeere.tractors.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
