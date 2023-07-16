package p1;

public class MatriculaJardin implements CalcularMatricula {
    private double tarifa;

    public void establecerTarifa() {
        tarifa = 50.2 + 140.2 + 40;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    @Override
    public double calcularTarifaMatricula() {
        return obtenerTarifa();
    }
}

