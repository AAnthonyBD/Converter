package com.anthonyDeLaCruz.conversorDeMoneda.interfaz;

public interface MonedaInterfaz {
    double getCantidad();
    String getCodigoMoneda();
    double convertirA(MonedaInterfaz otraMoneda);
}
