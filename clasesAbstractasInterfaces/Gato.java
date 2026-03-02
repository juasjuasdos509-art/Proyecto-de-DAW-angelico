package clasesAbstractasInterfaces;

//4. CLASE CONCRETA: Hereda de Animal e implementa Mascota
public class Gato extends Animal implements Mascota {

	// Atributos concretos
	private int numVidasRestantes;
	
	public Gato(String nombre, int numVidasRestantes) {
		super(nombre); // Llama al constructor de Animal
		this.numVidasRestantes = numVidasRestantes;
	}

	// Implementación obligatoria del método abstracto
	@Override
	public void hacerSonido() {
		System.out.println(nombre + " dice: Miau!");
	}

	// Implementación del método de la interfaz
	@Override
	public void jugar() {
		System.out.println(nombre + " está jugando con un ovillo de lana.");
	}
}
