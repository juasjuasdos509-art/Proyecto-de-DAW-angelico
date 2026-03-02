package clasesAbstractasInterfaces;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Animal generic = new Animal("Generic"); // Error: No se puede instanciar
        Perro miPerro = new Perro("godofredo");
        Gato miGato = new Gato("Michi", 5);
        
        
        miGato.dormir();      // Método concreto de clase abstracta
        miGato.hacerSonido(); // Método abstracto implementado
        miGato.jugar();       // Método de interfaz
        
        miPerro.dormir();      // Método concreto de clase abstracta
        miPerro.hacerSonido(); // Método abstracto implementado
        miPerro.jugar();
        
        // No se podría instanciar nunca un obeto del tipo Animal (porque tiene un método abstracto)
        // Animal perro = new Animal("Pepito");
    }
}
