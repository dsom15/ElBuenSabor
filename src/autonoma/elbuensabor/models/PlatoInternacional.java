
package autonoma.elbuensabor.models;

/**
 * Se crea la clase Plato Internacional
 * @author David Steven Ochoa 
 * 1.0.0
 * 08/12/2024
 */
public class PlatoInternacional extends Plato {
    /**
     * paisDeOrigen es el pais de original del plato internacional 
     */

    private String paisDeOrigen;
    /**
     * se herada los atributos del super clase plato
     * @param nombre 
     * @param costoFabricacion 
     * @param descripcionPlato
     * @param paisDeOrigen 
     */
    ///constructor 
     public PlatoInternacional(String nombre, double costoFabricacion,String descripcionPlato,String paisDeOrigen ) {
        super(nombre, costoFabricacion, descripcionPlato);
        this.paisDeOrigen = paisDeOrigen;
    }
    ///metodo de acceso 
      public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }
    ////metodo
    @Override
    /**
     * se calcula el precio de venta con iva de cada plato creado 
     * @return precio de venta de cada plato 
     */
    public double calcularPrecioDeVenta() {
        double precioSinIva = getCostoFabricacion() * 1.30;
        double iva = precioSinIva * 0.19;
        return precioSinIva + iva; 
    }
        
}  
   
