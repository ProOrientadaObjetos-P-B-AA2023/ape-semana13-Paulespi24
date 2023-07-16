package paquete01;

import java.util.ArrayList;

public class Televisor {
    private String marca;
    private double precio;

    public Televisor() {
    }

    public Televisor(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerMarca(String marca) {
        this.marca = marca;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public void establecerPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("TV: %s\n%.2f\n", obtenerMarca(), obtenerPrecio());
    }

    public double totalPrecioTvs(ArrayList<Televisor> tvs) {
        double total = 0.0;
        for (Televisor tv : tvs) {
            total += tv.obtenerPrecio();
        }
        return total;
    }
}
