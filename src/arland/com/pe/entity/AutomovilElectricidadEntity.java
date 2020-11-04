package arland.com.pe.entity;

public class AutomovilElectricidadEntity extends VehiculoAutomovilBase 
{ 
  public AutomovilElectricidadEntity(String modelo, String 
    color, int potencia, double espacio) 
  {
    super(modelo, color, potencia, espacio);
  }
 
  public void mostrarCaracteristicas() 
  { 
    System.out.println(
      "Automovil electrico de modelo: " + modelo +  
      " de color: " + color + " de potencia: " + 
      potencia + " de espacio: " + espacio); 
  } 
} 
 
