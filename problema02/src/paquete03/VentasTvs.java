package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

public class VentasTvs {
    double precioTotal;
    ArrayList<Televisor> televisores;
    String marcasVendidas;
    
    public void establecerTelevisores(ArrayList<Televisor> t){
        televisores = t;
    }
    
    public ArrayList<Televisor> obtenerTelevisores(){
        return televisores;
    }
    
    public void establecerPrecioTotal(){
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            s = s + televisores.get(i).obtenerPrecio();
            
        }
        precioTotal = s;
        
    }
    
    public double obtenerPrecioTotal(){
        return precioTotal;
    }
    
        
    public String obtenerMarcasVendidas(){
        return marcasVendidas;
    }
    
}
