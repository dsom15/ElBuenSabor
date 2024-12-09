
package autonoma.elbuensabor.models;

/**
 * Se crea la clase Plato nacional 
 * @author David Steven Ochoa 
 * 1.0.0
 * 08/12/2024
 */
public class PlatoNacional extends Plato {
    
      public PlatoNacional(String nombre, double costoFabricacion,String descripcionPlato) {
        super(nombre, costoFabricacion,descripcionPlato);
        
      } 
      @Override
    
    public double calcularPrecioDeVenta() {
        double precioSinIva = getCostoFabricacion() * 1.25; 
        double iva = precioSinIva * 0.19; 
        return precioSinIva + iva; 
    }

   
}
