package paquete004;

import paquete001.Persona;

/**
 *
 * @author reroes
 */
public class PagoTelefonoConvencional extends Pago {
    private double minutosConsumidos;
    private double costoMinuto;

    public PagoTelefonoConvencional(double costo, double minutosConsumidos) {
        super(costo);
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }

    @Override
    public double calcularPago() {
        return getCosto() + (minutosConsumidos * costoMinuto);
    }
}

