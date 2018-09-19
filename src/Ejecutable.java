
import java.util.*;


public class Ejecutable {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juanito");
        Persona persona2 = new Persona("Leonardo");
        
        Motor motor1 = new Motor("Volvo5000");
        Motor motor2 = new Motor("PihiriloMeCubro");
        
        persona1.addCarro(3, "BMW300", motor1);
        persona1.addCarro(4, "MERCEDES300", motor1);
        
        persona1.addCarro(4, "TOYOTA_X", motor2);
        persona2.addCarro(0, "RENAULT_S", motor2);
        
        ArrayList < Carro > InfoPersona1 = persona1.Info();
        ArrayList < Carro > InfoPersona2 = persona2.Info();
        
        for(int i = 0; i < InfoPersona1.size(); i++){
            System.out.println("Carro # " + (i + 1));
            System.out.println("    Tam. Ruedas: " + InfoPersona1.get(i).getRueda()[0].getRadio());
            System.out.println("    Modelo Chasis: " + InfoPersona1.get(i).getChasis().getNombre());
            System.out.println("    Modelo Motor: " + InfoPersona1.get(i).getMotor().getNombre());
        }
    }
}
