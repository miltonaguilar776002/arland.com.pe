package arland.com.pe.entity.factory;
import arland.com.pe.entity.VehiculoAutomovilBase;
import arland.com.pe.entity.AutomovilGasolinaEntity;
import arland.com.pe.entity.VehiculoScooterBase;
import arland.com.pe.entity.ScooterGasolinaEntity;

public class FabricaVehiculoGasolina implements IFabricaVehiculo 
{ 
  public VehiculoAutomovilBase creaAutomovil(String modelo, String 
    color, int potencia, double espacio) 
  { 
    return new AutomovilGasolinaEntity(modelo, color, 
      potencia, espacio); 
  } 
 
  public VehiculoScooterBase creaScooter(String modelo, String 
    color, int potencia) 
  { 
    return new ScooterGasolinaEntity(modelo, color, potencia); 
  } 
}
