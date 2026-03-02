package ud6;

final class SensorTemperatura extends DispositivoIoT {
	 public SensorTemperatura(String id, RedIoT red, double consumoBase) {
	 super(id, red, consumoBase);
	 }
	 @Override
	 public double procesarDatos() { return consumoBase; }
	}
