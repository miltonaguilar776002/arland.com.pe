package arland.com.pe.entity.factory;
import arland.com.pe.entity.VehiculoAutomovilBase;
import arland.com.pe.entity.VehiculoScooterBase;

public interface IFabricaVehiculo 
{ 
  VehiculoAutomovilBase creaAutomovil(String modelo, String color, 
    int potencia, double espacio); 
 
  VehiculoScooterBase creaScooter(String modelo, String color, int 
    potencia); 
} 
 
 
