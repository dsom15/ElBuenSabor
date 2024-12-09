
package autonoma.elbuensabor.models;

import java.util.ArrayList;
import java.util.Date;
/**
 * Se crea la clase Menu
 * @author David Steven Ochoa 
 * 1.0.0
 * 08/12/2024
 */
public class Menu {

    private String nombre;
    private Date yearcreation; 
    private ArrayList<Plato> listaplatos;
    private Plato plato;
    
    /////constructor
     public Menu(String nombre, Date yearcreation) {
        this.nombre = nombre;
        this.yearcreation = yearcreation;
        this.listaplatos = new ArrayList<>();
        this.plato = null;
    }
    
    
     public Menu() {
        this.nombre = "Default Menu"; 
        this.yearcreation = new Date(); 
        this.listaplatos = new ArrayList<>(); 
        this.plato = null; 
    }
    ////metodo de acceso 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getYearcreation() {
        return yearcreation;
    }

    public void setYearcreation(Date yearcreation) {
        this.yearcreation = yearcreation;
    }

    public ArrayList<Plato> getListaplatos() {
        return listaplatos;
    }

    
    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }
    ////metodo (CRUD)
    
    public boolean agregarPlato(Plato plato) {
        return this.listaplatos.add(plato);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    public Plato buscarPlato(Plato plato) {
        for (int i = 0; i < this.listaplatos.size(); i++) {
            Plato p = this.listaplatos.get(i);
            if (p.equals(plato)) {
                return p;
            }
        }
        return null;   
    }
    
    public Plato buscarPlato(long id) {
        for (int i = 0; i < this.listaplatos.size(); i++) {
            Plato p = this.listaplatos.get(i);
            if (p.getIdentificadorUnico() == id) {
                return p;
            }
        }
        return null;   
    }
    
    public Plato buscarPlato(String nombre) {
        for (int i = 0; i < this.listaplatos.size(); i++) {
            Plato p = this.listaplatos.get(i);
            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;   
    }
    
    private int buscarIndicePlato(long id) {
        for (int i = 0; i < this.listaplatos.size(); i++) {
            Plato p = this.listaplatos.get(i);
            if (p.getIdentificadorUnico() == id) {
                return i;
            }
        }
        return -1;  
    }
    
    ////////////////////////////////////////////////////////////////////////////
    public Plato actualizarPlato(long id, Plato plato) {
        int index = this.buscarIndicePlato(id);
        if (index >= 0) {
            return this.listaplatos.set(index, plato);
        } else {
            return null;
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    public Plato eliminarPlato(long id) {
        int index = this.buscarIndicePlato(id);
        if (index >= 0) {
            return this.listaplatos.remove(index);
        } else {
            return null;
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    public String mostrarMenu() {
        String menu = "";
        for (int i = 0; i < this.listaplatos.size(); i++) {
            Plato p = this.listaplatos.get(i);
            menu += p.toString() + "\n";
        }
        return menu;
    }

    
    
    
}
