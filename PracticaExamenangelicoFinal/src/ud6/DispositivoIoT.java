package ud6;

abstract class DispositivoIoT {
protected String id;
protected double consumoBase;
protected RedIoT red;
private static int contadorTotal = 0;
public DispositivoIoT(String id, RedIoT red, double consumoBase) {
this.id = id;
this.red = red;
this.consumoBase = consumoBase;
contadorTotal++;
}
public static int getContadorTotal() { return contadorTotal; }
public abstract double procesarDatos();
public void imprimirFicha() {
System.out.println("Dispositivo: " + id + " | Red: " + red.getNombreRed() +
" | Consumo Base: " + consumoBase + "W");
	}
}