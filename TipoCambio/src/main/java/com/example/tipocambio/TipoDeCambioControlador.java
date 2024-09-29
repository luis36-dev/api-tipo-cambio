package com.example.tipocambio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.tipocambio.ActualizarTipoDeCambio;

@RestController
@RequestMapping("/api/tipo-de-cambio")
public class TipoDeCambioControlador {

    @Autowired
    private TipoDeCambioServicio tipoDeCambioServicio;

    @Autowired
    private TipoDeCambioRepositorio tipoDeCambioRepositorio;

    @GetMapping
    public String obtenerInfo() {
        return "API de tipo de cambio está funcionando";
    }

    @PostMapping("/aplicar")
    public RespuestaTipoDeCambio aplicarTipoDeCambio(@RequestBody SolicitudTipoDeCambio solicitud) {
        Double montoConCambio = tipoDeCambioServicio.aplicarTipoDeCambio(
            solicitud.getMonedaOrigen(),
            solicitud.getMonedaDestino(),
            solicitud.getMonto());

        TipoDeCambio tipoDeCambio = tipoDeCambioRepositorio.findByMonedaOrigenAndMonedaDestino(
            solicitud.getMonedaOrigen(), solicitud.getMonedaDestino());

        if (tipoDeCambio == null) {
            throw new RuntimeException("Tipo de cambio no encontrado");
        }

        return new RespuestaTipoDeCambio(
            solicitud.getMonto(),
            montoConCambio,
            solicitud.getMonedaOrigen(),
            solicitud.getMonedaDestino(),
            tipoDeCambio.getValorCambio()
        );
    }

    @PostMapping("/actualizar")
    public String actualizarTipoDeCambio(@RequestBody ActualizarTipoDeCambio solicitud) {
        TipoDeCambio tipoDeCambio = tipoDeCambioRepositorio.findByMonedaOrigenAndMonedaDestino(
            solicitud.getMonedaOrigen(), solicitud.getMonedaDestino());

        if (tipoDeCambio == null) {
            return "Tipo de cambio no encontrado";
        }

        tipoDeCambio.setValorCambio(solicitud.getNuevoValorCambio());
        tipoDeCambioRepositorio.save(tipoDeCambio);

        return "Tipo de cambio actualizado con éxito";
    }
}
