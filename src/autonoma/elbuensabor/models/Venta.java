
package autonoma.elbuensabor.models;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * se implementan los archivos de texto 
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Se crea la clase Estado Financiero 
 * @author David Steven Ochoa 
 * 1.0.0
 * 08/12/2024
 */
public class Venta {
    /**
     * el contador es para darle valor al id cada que se realiza una venta
     */
    private static int contador = 1;
    /**
     * id es el identificador de cada venta 
     */
    private long id;
    /**
     * el valor total de venta es el total de las ventas realizadas 
     */
    private double valorTotalVenta;
    /**
     * se crea una lista con todas las ventas realizadas 
     */
    private  List<Plato> platosVendidos;
    /**
     * valorGanacia es la la ganancia generada de cada venta 
     */
    private double valorGanancia;
    /**
     * fechaVenta es la fecha de realicion de la venta 
     */
    private Date fechaVenta;
    ///constructor 
    public Venta(List<Plato> platosVendidos) {
        this.platosVendidos = platosVendidos;
        this.id = Venta.contador;
        this.fechaVenta=Date.from(Instant.now());
        calcularTotales();
        contador++;
    }
   
    /**
     * throw se me genero automatico por netbeans 
     */
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
     /**
     * se calcula el valor total de ventas 
     * @return  los valores de total de ventas y total de ganancia 
     */
   private void calcularTotales() {
        double totalVenta = 0;
        double gananciaTotal = 0;

        for (Plato plato : platosVendidos) {
            double precioPorCantidad = plato.getPrecioDeVenta() * plato.getCantidad();
            totalVenta += precioPorCantidad;            
            double precioSinIVA = plato.getPrecioDeVenta() / 1.19; 
            gananciaTotal += (precioSinIVA - plato.getCostoFabricacion()) * plato.getCantidad(); 
        }

        this.valorTotalVenta = totalVenta; 
        this.valorGanancia = gananciaTotal;
    }
   /**
    * metodo de generacion de archivo de texto 
    * @param nombreArchivo 
    */
     public void guardarEnArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            writer.write(this.toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar la venta en el archivo: " + e.getMessage());
        }
    }
 
}


