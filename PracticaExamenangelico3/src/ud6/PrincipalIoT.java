package ud6;

import java.util.ArrayList;
public class PrincipalIoT {
 public static void main(String[] args) {
 RedIoT red5G = new RedIoT("Red Municipal 5G");
 ArrayList<DispositivoIoT> listaDispositivos = new ArrayList<>();
 listaDispositivos.add(new SensorCO2("CO2-Vial1", red5G, 15.0));
 listaDispositivos.add(new SensorHumedad("HUM-Parque", red5G, 10.0,
2.5));
 listaDispositivos.add(new SensorTemperatura("TEMP-Norte", red5G, 8.0));
 System.out.println("=== SISTEMA DE GESTIÓN RED IOT SMARTCITY ===");
 

	
		 }
		}