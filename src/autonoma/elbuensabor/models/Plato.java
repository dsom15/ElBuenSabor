
package autonoma.elbuensabor.models;
import java.util.List;

/**
 * Se crea la clase Plato
 * @author David Steven Ochoa 
 * 1.0.0
 * 08/12/2024
 */
public abstract class Plato {
    /**
     * constante contador para tener en cuanta para el identificador unico de cada plato 
     */
    private static int contadorPlato = 1;
    /**
     * nombre del plato 
     */
    private String nombre;
    /**
     * identificador unico de cada plato que se agrega 
     */
    private long identificadorUnico;
    /**
     * precioDeVenta de cada plato que se crea 
     */
    private double precioDeVenta;
    /**
     * costo de fabricacion de cada plato 
     */
    private double costoFabricacion;
    /**
     * descripcion de cada plato 
     */
    private String descripcionPlato;
    /**
     * cantidad de cada plato esto es cuando se va a vender el plato 
     */
    private int cantidad;
    /////constructor 

   public Plato(String nombre, double costoFabricacion,String descripcionPlato) {
    this.nombre = nombre;
    this.precioDeVenta = calcularPrecioDeVenta();
    this.identificadorUnico = Plato.contadorPlato;
    this.costoFabricacion = costoFabricacion; 
    this.descripcionPlato = descripcionPlato; 
    this.cantidad=1;
    contadorPlato++;
}
    
    public Plato() {
        this.nombre = "";
        this.identificadorUnico = Plato.contadorPlato;
        this.precioDeVenta = 0;
        this.costoFabricacion = 0;
        this.descripcionPlato = "";
        this.cantidad=1;
        contadorPlato++;
    }
    ///metodo de acceso 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getIdentificadorUnico() {
        return identificadorUnico;
    }

    public double getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(double precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public String getDescripcionPlato() {
        return descripcionPlato;
    }

    public void setDescripcionPlato(String descripcionPlato) {
        this.descripcionPlato = descripcionPlato;
    }
    
      public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    @Override
    public String toString() {
        return "Plato{" + "nombre=" + nombre + ", identificadorUnico=" + identificadorUnico + ", precioDeVenta=" + precioDeVenta + ", costoFabricacion=" + costoFabricacion + ", descripcionPlato=" + descripcionPlato + '}';
    }
    /**
     * Metodo abstracto para calcular el precio de venta
     * es abtracto por que el calculo se hace en la clase plato nacional e internacional 
     * @return 
     */
   // 
    public abstract double calcularPrecioDeVenta();
    
    
   

}
