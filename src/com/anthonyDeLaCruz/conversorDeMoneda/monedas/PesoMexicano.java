package com.anthonyDeLaCruz.conversorDeMoneda.monedas;

import com.anthonyDeLaCruz.conversorDeMoneda.modelos.MonedaBase;

public class PesoMexicano extends MonedaBase {
    public PesoMexicano(double cantidad) {
        super(cantidad);
    }

    @Override
    public String getCodigoMoneda() {
        return "MXN";
    }
}
