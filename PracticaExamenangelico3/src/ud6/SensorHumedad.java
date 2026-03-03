package ud6;

final class SensorHumedad extends DispositivoIoT {
	 private double ajustePrecision;
	 
	 public SensorHumedad() {
	 super(id, red, consumoBase);
	 this.ajustePrecision = ajuste;
	 }
	 @Override
	 public double procesarDatos() {}
	}