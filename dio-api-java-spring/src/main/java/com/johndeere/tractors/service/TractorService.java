package com.johndeere.tractors.service;

import com.johndeere.tractors.model.Tractor;
import com.johndeere.tractors.repository.TractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TractorService {
    @Autowired
    private TractorRepository tractorRepository;

    public List<Tractor> findAll() {
        return tractorRepository.findAll();
    }

    public Tractor findById(Long id) {
        return tractorRepository.findById(id).orElse(null);
    }

    public Tractor save(Tractor tractor) {
        return tractorRepository.save(tractor);
    }

    public void deleteById(Long id) {
        tractorRepository.deleteById(id);
    }
}
