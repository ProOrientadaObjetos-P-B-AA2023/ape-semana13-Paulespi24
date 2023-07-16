package paquete004;


public abstract class Pago {
    private double costo;
    public Pago(double costo) {
        this.costo = costo;
    }
    public abstract double calcularPago();
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
}

