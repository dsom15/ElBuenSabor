
package autonoma.elbuensabor.models;
import java.util.Date;
import java.util.List;
/**
 * Se crea la clase Estado Financiero 
 * @author David Steven Ochoa 
 * 1.0.0
 * 08/12/2024
 */
public class EstadoFinanciero {

    private Date fechaGeneracion;
    private double totalRecaudado;
    private double totalGanancias;
    ////constructor 
   public EstadoFinanciero(List<Venta> ventas) {
        this.fechaGeneracion = new Date();
        calcularTotales(ventas);
    }

    // Constructor vacío
    public EstadoFinanciero() {
        this.fechaGeneracion = new Date();
        this.totalRecaudado = 0.0;
        this.totalGanancias = 0.0;
    }
    ///metodo de acceso 
    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public double getTotalGanancias() {
        return totalGanancias;
    }

    public void setTotalGanancias(double totalGanancias) {
        this.totalGanancias = totalGanancias;
    }
    ///metodo
    @Override
    public String toString() {
        return "EstadoFinanciero{" + "fechaGeneracion=" + fechaGeneracion + ", totalRecaudado=" + totalRecaudado + ", totalGanancias=" + totalGanancias + '}';
    }
    
    private void calcularTotales(List<Venta> ventas) {
        this.totalRecaudado = 0.0; // Inicializa el total recaudado
        this.totalGanancias = 0.0; // Inicializa el total de ganancias

        // Recorre la lista de ventas
        for (Venta venta : ventas) {
            this.totalRecaudado += venta.getValorTotalVenta(); // Suma el total de la venta al total recaudado
            this.totalGanancias += venta.getValorGanancia(); // Suma la ganancia de la venta al total de ganancias
        }
    }
}
