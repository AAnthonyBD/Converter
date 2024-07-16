package com.anthonyDeLaCruz.conversorDeMoneda.monedas;

import com.anthonyDeLaCruz.conversorDeMoneda.modelos.MonedaBase;

public class Yen extends MonedaBase {
    public Yen(double cantidad) {
        super(cantidad);
    }

    @Override
    public String getCodigoMoneda() {
        return "JPY";
    }
}
