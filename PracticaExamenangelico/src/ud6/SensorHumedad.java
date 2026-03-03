package ud6;

final class SensorHumedad extends DispositivoIoT {

	 public SensorHumedad() {
	
	 }
	 @Override
	 public double procesarDatos() { return consumoBase + ajustePrecision; }
	}