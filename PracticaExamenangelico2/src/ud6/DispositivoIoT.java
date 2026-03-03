package ud6;

abstract class DispositivoIoT {
protected String id;
protected double consumoBase;
protected RedIoT red;
private static int contadorTotal = 0;
public DispositivoIoT() {

}
public static int getContadorTotal() { return contadorTotal; }

	}