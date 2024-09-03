package com.johndeere.tractors.repository;

import com.johndeere.tractors.model.Tractor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TractorRepository extends JpaRepository<Tractor, Long> {
}
