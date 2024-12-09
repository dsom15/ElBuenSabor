
package autonoma.elbuensabor.main;
import autonoma.elbuensabor.models.Restaurante;
import autonoma.elbuensabor.views.VentanaPrincipal;

/**
 * Se crea la clase RestauranteApp en el main 
 * @author David Steven Ochoa 
 * 1.0.0
 * 08/12/2024
 */
public class RestauranteApp {
    public static void main(String[] args) {
        /**
         * se crea el objeto restaurante 
         */
        Restaurante resturante = new Restaurante ("El Buen Sabor ", "Avenida Santander", "3105485858");
        /**
         * se crea el objeto ventana principal 
         */
        VentanaPrincipal ventana = new VentanaPrincipal(resturante);
        /**
         * se envia que la ventana es visible para inicializar 
         */
        ventana.setVisible(true);
    }
}
