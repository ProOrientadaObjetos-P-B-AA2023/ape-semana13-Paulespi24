package paquete004;

import paquete001.Persona;


public class PagoAguaPotable extends Pago {
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;

    public PagoAguaPotable(double costo, double metrosCubicosConsumo, double costoConsumoCubicos) {
        super(costo);
        this.metrosCubicosConsumo = metrosCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
    }

    @Override
    public double calcularPago() {
        return getCosto() + (metrosCubicosConsumo * costoConsumoCubicos);
    }
}

