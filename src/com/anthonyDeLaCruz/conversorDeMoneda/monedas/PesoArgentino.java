package com.anthonyDeLaCruz.conversorDeMoneda.monedas;

import com.anthonyDeLaCruz.conversorDeMoneda.modelos.MonedaBase;

public class PesoArgentino extends MonedaBase {
    public PesoArgentino(double cantidad) {
        super(cantidad);
    }

    @Override
    public String getCodigoMoneda() {
        return "ARS";
    }
}
