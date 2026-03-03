package ud6;

final class SensorCO2 extends DispositivoIoT implements Conectable {
	 private double plusCalibracion = 5.0;
	 public SensorCO2(String id, RedIoT red, double consumoBase) {
	
	 }
	 @Override
	 public double procesarDatos() { return consumoBase + plusCalibracion; }
	}
