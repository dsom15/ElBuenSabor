
package autonoma.elbuensabor.models;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dsoch
 */
public class Venta {
    private static int contador = 1;
    private long id;
    private double valorTotalVenta;
    private  List<Plato> platosVendidos;
    private double valorGanancia;
    private Date fechaVenta;
    ///constructor 
    public Venta(List<Plato> platosVendidos) {
        this.platosVendidos = platosVendidos;
        this.id = Venta.contador;
        this.fechaVenta= Date.from(Instant.now());
        calcularTotales();
        contador++;
    }
   

    Venta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    


    ///metodo de acceso
     public long getId() {
        return id;
    }

    public double getValorTotalVenta() {
        return valorTotalVenta;
    }

    public List<Plato> getPlatosVendidos() {
        return platosVendidos;
    }

    public double getValorGanancia() {
        return valorGanancia;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }
    ///metodo
    @Override
    public String toString() {
        return "Venta{" + "valorTotalVenta=" + valorTotalVenta + ", platosVendidos=" + platosVendidos + ", fechaVenta=" + fechaVenta + '}';
    }
    
   private void calcularTotales() {
        double totalVenta = 0;
        double gananciaTotal = 0;

        for (Plato plato : platosVendidos) {
            double precioPorCantidad = plato.getPrecioDeVenta() * plato.getCantidad(); // Valor total por la cantidad de platos
            totalVenta += precioPorCantidad; // Sumar el precio total al total de la venta
            
            double precioSinIVA = plato.getPrecioDeVenta() / 1.19; // Precio sin IVA
            gananciaTotal += (precioSinIVA - plato.getCostoFabricacion()) * plato.getCantidad(); // Ganancia total por la cantidad de platos
        }

        this.valorTotalVenta = totalVenta; // Asigna el total de la venta
        this.valorGanancia = gananciaTotal; // Asigna la ganancia total
    }

   
    
}


