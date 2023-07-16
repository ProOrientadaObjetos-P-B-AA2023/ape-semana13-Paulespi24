package p1;

public class MatriculaCampamento implements CalcularMatricula {
    private double tarifa;

    public void establecerTarifa() {

        tarifa = 100.2 + 30.2 + 90.2;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    @Override
    public double calcularTarifaMatricula() {
        return obtenerTarifa();
    }
}
