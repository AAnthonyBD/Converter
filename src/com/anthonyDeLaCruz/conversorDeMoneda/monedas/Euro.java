package com.anthonyDeLaCruz.conversorDeMoneda.monedas;

import com.anthonyDeLaCruz.conversorDeMoneda.modelos.MonedaBase;

public class Euro extends MonedaBase {
    public Euro(double cantidad) {
        super(cantidad);
    }

    @Override
    public String getCodigoMoneda() {
        return "EUR";
    }
}
