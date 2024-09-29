package com.example.tipocambio;

public class RespuestaTipoDeCambio {
    private Double montoOriginal;
    private Double montoConCambio;
    private String monedaOrigen;
    private String monedaDestino;
    private Double tipoDeCambio;

    public RespuestaTipoDeCambio(Double montoOriginal, Double montoConCambio, String monedaOrigen, String monedaDestino, Double tipoDeCambio) {
        this.montoOriginal = montoOriginal;
        this.montoConCambio = montoConCambio;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.tipoDeCambio = tipoDeCambio;
    }

    public Double getMontoOriginal() {
        return montoOriginal;
    }

    public void setMontoOriginal(Double montoOriginal) {
        this.montoOriginal = montoOriginal;
    }

    public Double getMontoConCambio() {
        return montoConCambio;
    }

    public void setMontoConCambio(Double montoConCambio) {
        this.montoConCambio = montoConCambio;
    }

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

    public Double getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(Double tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }
}