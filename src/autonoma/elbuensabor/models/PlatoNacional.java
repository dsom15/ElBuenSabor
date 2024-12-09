
package autonoma.elbuensabor.models;

/**
 * Se crea la clase Plato nacional 
 * @author David Steven Ochoa 
 * 1.0.0
 * 08/12/2024
 */
public class PlatoNacional extends Plato {
       /**
        * se eran los atributos de la super clase plato
        * @param nombre 
        * @param costoFabricacion  
        * @param descripcionPlato 
        */ 
    //constructor 
      public PlatoNacional(String nombre, double costoFabricacion,String descripcionPlato) {
        super(nombre, costoFabricacion,descripcionPlato);
        
      } 
      @Override
    /**
     * se calcula el precio de venta con iva de cada plato creado 
     * @return precio de venta de cada plato 
     */
    public double calcularPrecioDeVenta() {
        double precioSinIva = getCostoFabricacion() * 1.25; 
        double iva = precioSinIva * 0.19; 
        return precioSinIva + iva; 
    }

   
}
