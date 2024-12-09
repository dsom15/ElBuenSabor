/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.elbuensabor.main;
import autonoma.elbuensabor.models.Restaurante;
import autonoma.elbuensabor.views.VentanaPrincipal;

/**
 *
 * @author Dsoch
 */
public class RestauranteApp {
    public static void main(String[] args) {
        Restaurante resturante = new Restaurante ("El Buen Sabor ", "Avenida Santander", "3105485858");
        VentanaPrincipal ventana = new VentanaPrincipal(resturante);
        ventana.setVisible(true);
    }
}
