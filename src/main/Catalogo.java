package main;
import java.util.*;

import arland.com.pe.entity.VehiculoAutomovilBase;
import arland.com.pe.entity.VehiculoScooterBase;
import arland.com.pe.entity.factory.IFabricaVehiculo;
import arland.com.pe.entity.factory.FabricaVehiculoElectricidad;
import arland.com.pe.entity.factory.FabricaVehiculoGasolina; 
public class Catalogo 
{ 
  public static int nAutos = 3; 
  public static int nScooters = 2; 
 
  public static void main(String[] args) 
  { 
    Scanner reader = new Scanner(System.in); 
    IFabricaVehiculo fabrica; 
    VehiculoAutomovilBase[] autos = new VehiculoAutomovilBase[nAutos]; 
    VehiculoScooterBase[] scooters = new VehiculoScooterBase[nScooters]; 
    System.out.print("Desea utilizar " + 
      "vehiculos electricos (1) o a gasolina (2):"); 
    String eleccion = reader.next(); 
    if (eleccion.equals("1")) 
    { 
      fabrica = new FabricaVehiculoElectricidad(); 
    } 
    else 
    { 
      fabrica = new FabricaVehiculoGasolina(); 
    } 
    for (int index = 0; index < nAutos; index++) 
      autos[index] = fabrica.creaAutomovil("estandar",  
        "amarillo", 6+index, 3.2); 
    for (int index = 0; index < nScooters; index++) 
      scooters[index] = fabrica.creaScooter("clasico",  
        "rojo", 2+index); 
    for (VehiculoAutomovilBase auto: autos) 
      auto.mostrarCaracteristicas(); 
    for (VehiculoScooterBase scooter: scooters) 
      scooter.mostrarCaracteristicas(); 
  } 
 
}
