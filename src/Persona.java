
import java.util.*;

public class Persona {
    
    private String nombre;
    private ArrayList < Carro > carros = new ArrayList<>();

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public void addCarro(int radioRuedas, String nombreChasis, Motor motor){
        carros.add(new Carro(radioRuedas, nombreChasis, motor));
    }
    public ArrayList < Carro > Info(){
        return carros;
    }
    

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
