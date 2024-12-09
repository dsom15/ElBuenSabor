
package autonoma.elbuensabor.models;
import java.util.ArrayList;
import java.util.Date;
/**
 * Se crea la clase Restaurante
 * @author David Steven Ochoa 
 * 1.0.0
 * 08/12/2024
 */
public class Restaurante {
    /**
     * nombre es el nomnbre del restaurante 
     */
    private String nombre;
    /**
     * direccion es la direccion del restaurante 
     */
    private String direccion;
    /**
     * telefono es el telefono del restaurante
     */
    private String telefono; 
    /**
     * menu es el menu del restaurante y es llamada de la clase menu 
     */
    private Menu menu;
    /**
     * venta es la venta de cada producto del menu y se llamada de la clase menu 
     */
    private Venta venta;
    /**
     * estado financiero es el estado financiero de las ventas y se llama de la clase estado financiero 
     */
    private EstadoFinanciero estadoFinanciero;
    
    //////Contructor 
    public Restaurante(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.menu = new Menu(); 
        this.estadoFinanciero = new EstadoFinanciero(); 
    }
    
    public Restaurante() {
        this.menu = new Menu(); 
        this.venta = new Venta(); 
        this.estadoFinanciero = new EstadoFinanciero(); 
    }
    ///////Metodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
     public Menu getMenu() {
        return menu;
    }

    
     public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public EstadoFinanciero getEstadoFinanciero() {
        return estadoFinanciero;
    }

    public void setEstadoFinanciero(EstadoFinanciero estadoFinanciero) {
        this.estadoFinanciero = estadoFinanciero;
    }
    
  
    // Metodo (CRUD) 
    
    public boolean agregarPlato(Plato plato) {
        return this.menu.agregarPlato(plato);
    }
    
    public Plato buscarPlato(long id) {
        return this.menu.buscarPlato(id);
    }
    
    public Plato buscarPlato(String nombre) {
        return this.menu.buscarPlato(nombre);
    }
    
    public Plato actualizarPlato(long id, Plato plato) {
        return this.menu.actualizarPlato(id, plato);
    }
    
    public Plato eliminarPlato(long id) {
        return this.menu.eliminarPlato(id);
    }
    
    public String mostrarMenu() {
        return this.menu.mostrarMenu();
    }
    

}

