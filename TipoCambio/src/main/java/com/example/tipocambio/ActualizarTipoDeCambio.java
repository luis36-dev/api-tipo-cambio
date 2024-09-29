package com.example.tipocambio;

public class ActualizarTipoDeCambio {
    private String monedaOrigen;
    private String monedaDestino;
    private Double nuevoValorCambio;

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public Double getNuevoValorCambio() {
        return nuevoValorCambio;
    }

    public void setNuevoValorCambio(Double nuevoValorCambio) {
        this.nuevoValorCambio = nuevoValorCambio;
    }
}
