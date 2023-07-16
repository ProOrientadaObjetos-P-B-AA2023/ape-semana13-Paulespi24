package paquete004;

import paquete001.Persona;

public class PagoLuzElectrica extends Pago {
    private double kilovatiosConsumidos;
    private double costoKilovatio;
    private String ciudad;

    public PagoLuzElectrica(double costo, double kilovatiosConsumidos, double costoKilovatio, String ciudad) {
        super(costo);
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoKilovatio = costoKilovatio;
        this.ciudad = ciudad;
    }

    @Override
    public double calcularPago() {
        double pago = getCosto() + (kilovatiosConsumidos * costoKilovatio);
        if (ciudad.equals("Loja")) {
            pago /= 2;
        }
        return pago;
    }
}
