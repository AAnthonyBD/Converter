package com.anthonyDeLaCruz.conversorDeMoneda;

import java.util.Scanner;
import com.anthonyDeLaCruz.conversorDeMoneda.interfaz.MonedaInterfaz;
import com.anthonyDeLaCruz.conversorDeMoneda.monedas.*;

public class ConversorMoneda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la moneda de origen:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Yen (JPY)");
        System.out.println("4. Peso Mexicano (MXN)");
        System.out.println("5. Peso Argentino (ARS)");
        int opcionOrigen = scanner.nextInt();

        System.out.println("Ingrese la cantidad:");
        double cantidad = scanner.nextDouble();

        MonedaInterfaz monedaOrigen = crearMoneda(opcionOrigen, cantidad);

        System.out.println("Seleccione la moneda de destino:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Yen (JPY)");
        System.out.println("4. Peso Mexicano (MXN)");
        System.out.println("5. Peso Argentino (ARS)");
        int opcionDestino = scanner.nextInt();

        MonedaInterfaz monedaDestino = crearMoneda(opcionDestino, 0);

        double cantidadConvertida = monedaOrigen.convertirA(monedaDestino);
        System.out.println(cantidad + " " + obtenerNombreMoneda(opcionOrigen) + " son " + cantidadConvertida + " " + obtenerNombreMoneda(opcionDestino));
    }

    private static MonedaInterfaz crearMoneda(int opcion, double cantidad) {
        switch (opcion) {
            case 1: return new Dolar(cantidad);
            case 2: return new Euro(cantidad);
            case 3: return new Yen(cantidad);
            case 4: return new PesoMexicano(cantidad);
            case 5: return new PesoArgentino(cantidad);
            default: return null;
        }
    }

    private static String obtenerNombreMoneda(int opcion) {
        switch (opcion) {
            case 1: return "Dólares (USD)";
            case 2: return "Euros (EUR)";
            case 3: return "Yenes (JPY)";
            case 4: return "Pesos Mexicanos (MXN)";
            case 5: return "Pesos Argentinos (ARS)";
            default: return "";
        }
    }
}