
package autonoma.elbuensabor.models;
import java.util.List;

/**
 * Se crea la clase Plato
 * @author David Steven Ochoa 
 * 1.0.0
 * 08/12/2024
 */
public abstract class Plato {
    private static int contadorPlato = 1;
    private String nombre;
    private long identificadorUnico;
    private double precioDeVenta;
    private double costoFabricacion;
    private String descripcionPlato;
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

   // Método abstracto para calcular el precio de venta
    public abstract double calcularPrecioDeVenta();
    
    
   

}
