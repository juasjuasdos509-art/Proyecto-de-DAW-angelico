package clasesAbstractasInterfaces;

public class Perro extends Animal implements Mascota {
		
		public Perro(String nombre) {
			super(nombre); 
		}

		// Implementación obligatoria del método abstracto
		@Override
		public void hacerSonido() {
			System.out.println(nombre + " dice: guau");
		}

		// Implementación del método de la interfaz
		@Override
		public void jugar() {
			System.out.println(nombre + " está jugando con su cola");
		}
	}

