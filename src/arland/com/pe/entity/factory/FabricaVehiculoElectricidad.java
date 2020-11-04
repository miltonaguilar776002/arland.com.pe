package arland.com.pe.entity.factory;
import arland.com.pe.entity.VehiculoAutomovilBase;
import arland.com.pe.entity.AutomovilElectricidadEntity;
import arland.com.pe.entity.VehiculoScooterBase;
import arland.com.pe.entity.ScooterElectricidadEntity;

public class FabricaVehiculoElectricidad implements IFabricaVehiculo 
{ 
  public VehiculoAutomovilBase creaAutomovil(String modelo, String 
    color, int potencia, double espacio) 
  { 
    return new AutomovilElectricidadEntity(modelo, color, 
      potencia, espacio); 
  } 
 
  public VehiculoScooterBase creaScooter(String modelo, String 
    color, int potencia) 
  { 
    return new ScooterElectricidadEntity(modelo, color, 
      potencia); 
  } 
} 
 
