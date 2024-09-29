package com.example.tipocambio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class TipoDeCambioServicio {

	@Autowired
    private TipoDeCambioRepositorio tipoDeCambioRepositorio;

    public Double aplicarTipoDeCambio(String monedaOrigen, String monedaDestino, Double monto) {
        TipoDeCambio tipoDeCambio = tipoDeCambioRepositorio.findByMonedaOrigenAndMonedaDestino(monedaOrigen, monedaDestino);
        if (tipoDeCambio != null) {
            return monto * tipoDeCambio.getValorCambio();
        } else {
            throw new RuntimeException("Tipo de cambio no encontrado para las monedas especificadas.");
        }
    }
}
