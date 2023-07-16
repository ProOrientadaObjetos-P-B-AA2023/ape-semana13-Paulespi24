package p1;

public class MatriculaMaternal implements CalcularMatricula {
    private double tarifa;

    public void establecerTarifa() {
        tarifa = 50.2 + 40.2 + 80.2;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    @Override
    public double calcularTarifaMatricula() {
        return obtenerTarifa();
    }
}
