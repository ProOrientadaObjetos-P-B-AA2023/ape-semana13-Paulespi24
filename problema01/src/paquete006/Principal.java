package paquete006;
import paquete003.BilleteraPagos;
import paquete001.Persona;
import paquete004.*;

public class Principal {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Paul");
        persona.setApellido("Espinosa");

        BilleteraPagos billetera = new BilleteraPagos(persona);

        double[][] datosAguaComerciales = DatosAgua.datosComerciales();
        for (double[] dato : datosAguaComerciales) {
            PagoAguaPotable pagoAguaComercial = new PagoAguaPotable(dato[0], dato[1], dato[2]);
            billetera.agregarPago(pagoAguaComercial);
        }

        double[][] datosAguaCasas = DatosAgua.datosCasas();
        for (double[] dato : datosAguaCasas) {
            PagoAguaPotable pagoAguaCasa = new PagoAguaPotable(dato[0], dato[1], dato[2]);
            billetera.agregarPago(pagoAguaCasa);
        }

        double[][] datosLuzLoja = DatosLuz.datosLoja();
        for (double[] dato : datosLuzLoja) {
            PagoLuzElectrica pagoLuzLoja = new PagoLuzElectrica(dato[0], dato[1], dato[2], "Loja");
            billetera.agregarPago(pagoLuzLoja);
        }

        double[][] datosLuzGeneral = DatosLuz.datosGeneral();
        for (double[] dato : datosLuzGeneral) {
            PagoLuzElectrica pagoLuzGeneral = new PagoLuzElectrica(dato[0], dato[1], dato[2], "General");
            billetera.agregarPago(pagoLuzGeneral);
        }

        double[][] datosPropiedades = DatosPropiedades.datos();
        for (double[] dato : datosPropiedades) {
            double valorPropiedad = dato[0];
            double porcentajeDescuento = dato[1];
            PagoPredial pagoPredial = new PagoPredial(valorPropiedad, porcentajeDescuento);
            billetera.agregarPago(pagoPredial);
        }

        double[][] datosTelefono = DatosTelefono.datos();
        for (double[] dato : datosTelefono) {
            PagoTelefonoConvencional pagoTelefono = new PagoTelefonoConvencional(dato[0], dato[1]);
            billetera.agregarPago(pagoTelefono);
        }
        String informe = billetera.generarReporte();
        System.out.println(informe);
    }
}
