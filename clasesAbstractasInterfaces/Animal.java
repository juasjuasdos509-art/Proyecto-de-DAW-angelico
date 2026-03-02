package clasesAbstractasInterfaces;


//2. CLASE ABSTRACTA: No se puede instanciar, sirve como base
abstract class Animal {
	protected String nombre;

	public Animal(String nombre) {
		this.nombre = nombre;
	}

	// Método Concreto: Todos los animales duermen igual
	public void dormir() {
		System.out.println(nombre + " está durmiendo (Zzz)");
	}

	// 3. MÉTODO ABSTRACTO: Obliga a las subclases a implementarlo
	public abstract void hacerSonido();
}
