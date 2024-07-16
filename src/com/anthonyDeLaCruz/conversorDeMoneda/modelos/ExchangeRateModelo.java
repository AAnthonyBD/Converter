package com.anthonyDeLaCruz.conversorDeMoneda.modelos;

import java.util.Map;

public class ExchangeRateModelo {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public String getBase(){
        return base_code;
    }

    public void setBase(String base) {
        this.base_code = base;
    }

    public Map<String, Double> getRates() {
        return conversion_rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.conversion_rates = rates;
    }
}

