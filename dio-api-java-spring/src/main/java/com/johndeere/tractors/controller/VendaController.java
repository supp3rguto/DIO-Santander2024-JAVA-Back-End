package com.johndeere.tractors.controller;

import com.johndeere.tractors.model.Venda;
import com.johndeere.tractors.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaController {
    @Autowired
    private VendaService vendaService;

    @GetMapping
    public List<Venda> getAllVendas() {
        return vendaService.findAll();
    }

    @GetMapping("/{id}")
    public Venda getVendaById(@PathVariable Long id) {
        return vendaService.findById(id);
    }

    @PostMapping
    public Venda createVenda(@RequestBody Venda venda) {
        return vendaService.save(venda);
    }

    @PutMapping("/{id}")
    public Venda updateVenda(@PathVariable Long id, @RequestBody Venda venda) {
        venda.setId(id);
        return vendaService.save(venda);
    }

    @DeleteMapping("/{id}")
    public void deleteVenda(@PathVariable Long id) {
        vendaService.deleteById(id);
    }
}
