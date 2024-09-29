package com.example.tipocambio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDeCambioRepositorio extends JpaRepository<TipoDeCambio, Long> {
    TipoDeCambio findByMonedaOrigenAndMonedaDestino(String monedaOrigen, String monedaDestino);
}
