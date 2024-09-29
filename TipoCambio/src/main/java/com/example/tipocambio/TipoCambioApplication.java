package com.example.tipocambio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.tipocambio")
public class TipoCambioApplication implements CommandLineRunner{
	@Autowired
    private TipoDeCambioRepositorio tipoDeCambioRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(TipoCambioApplication.class, args);
	}
	@Override
    public void run(String... args) throws Exception {
    
        TipoDeCambio cambioUSDToPEN = new TipoDeCambio();
        cambioUSDToPEN.setMonedaOrigen("USD");
        cambioUSDToPEN.setMonedaDestino("PEN");
        cambioUSDToPEN.setValorCambio(3.75);
        tipoDeCambioRepositorio.save(cambioUSDToPEN);

        TipoDeCambio cambioEURToPEN = new TipoDeCambio();
        cambioEURToPEN.setMonedaOrigen("EUR");
        cambioEURToPEN.setMonedaDestino("PEN");
        cambioEURToPEN.setValorCambio(4.50);
        tipoDeCambioRepositorio.save(cambioEURToPEN);
    }
}