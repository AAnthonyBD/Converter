package com.anthonyDeLaCruz.conversorDeMoneda.monedas;

import com.anthonyDeLaCruz.conversorDeMoneda.interfaz.MonedaInterfaz;
import com.anthonyDeLaCruz.conversorDeMoneda.modelos.MonedaBase;

public class Dolar extends MonedaBase {
    public Dolar(double cantidad) {
        super(cantidad);
    }

    @Override
    public String getCodigoMoneda() {
        return "USD";
    }
}

