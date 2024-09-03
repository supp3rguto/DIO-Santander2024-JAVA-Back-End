package com.johndeere.tractors.dto;

import java.time.LocalDate;

public class VendaDTO {
    private Long id;
    private LocalDate data;
    private double total;
    private Long tractorId;
    private Long clienteId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Long getTractorId() {
        return tractorId;
    }

    public void setTractorId(Long tractorId) {
        this.tractorId = tractorId;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }
}
