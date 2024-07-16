package com.anthonyDeLaCruz.conversorDeMoneda.modelos;

import com.anthonyDeLaCruz.conversorDeMoneda.interfaz.MonedaInterfaz;
import com.anthonyDeLaCruz.conversorDeMoneda.api.ApiExchangeRate;

public abstract class MonedaBase implements MonedaInterfaz {
    protected double cantidad;

    public MonedaBase(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public double getCantidad() {
        return cantidad;
    }

    // Método abstracto para obtener el código de la moneda
    public abstract String getCodigoMoneda();

    @Override
    public double convertirA(MonedaInterfaz otraMoneda) {
        double tasaCambio = ApiExchangeRate.obtenerTasaCambio(this.getCodigoMoneda(), otraMoneda.getCodigoMoneda());
        return this.cantidad * tasaCambio;
    }
}