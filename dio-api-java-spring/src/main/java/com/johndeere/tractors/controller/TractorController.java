package com.johndeere.tractors.controller;

import com.johndeere.tractors.model.Tractor;
import com.johndeere.tractors.service.TractorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tractors")
public class TractorController {
    @Autowired
    private TractorService tractorService;

    @GetMapping
    public List<Tractor> getAllTractors() {
        return tractorService.findAll();
    }

    @GetMapping("/{id}")
    public Tractor getTractorById(@PathVariable Long id) {
        return tractorService.findById(id);
    }

    @PostMapping
    public Tractor createTractor(@RequestBody Tractor tractor) {
        return tractorService.save(tractor);
    }

    @PutMapping("/{id}")
    public Tractor updateTractor(@PathVariable Long id, @RequestBody Tractor tractor) {
        tractor.setId(id);
        return tractorService.save(tractor);
    }

    @DeleteMapping("/{id}")
    public void deleteTractor(@PathVariable Long id) {
        tractorService.deleteById(id);
    }
}
