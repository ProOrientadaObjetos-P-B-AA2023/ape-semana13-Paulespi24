package p1;

public class MatriculaEscuela implements CalcularMatricula {
    private double tarifa;

    public void establecerTarifa() {
        tarifa = 50.2 + 40.2 + 140.2 + 200.4;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    @Override
    public double calcularTarifaMatricula() {
        return obtenerTarifa();
    }
}

