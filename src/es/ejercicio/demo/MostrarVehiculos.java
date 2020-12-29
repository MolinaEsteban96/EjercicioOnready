package es.ejercicio.demo;

import java.util.*;

public class MostrarVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		Vehiculo AutoPeugeot = new Auto("Peugeot","206",(int)4,(float)200000);
		Vehiculo AutoPeugeot2 = new Auto("Peugeot","208",(int)5,(float)250000);
		Vehiculo MotoHonda = new Moto("Honda","Titan","125cc",(float)60000);
		Vehiculo MotoYamaha = new Moto("Yamaha","YBR","160cc",(float)80500.50);
		
		vehiculos.add(AutoPeugeot);
		vehiculos.add(AutoPeugeot2);
		vehiculos.add(MotoHonda);
		vehiculos.add(MotoYamaha);
		
		for (Vehiculo vehiculo : vehiculos) {
			if(vehiculo instanceof Auto) {
				System.out.println("Marca: "+vehiculo.getMarca()+ " // Modelo: "+vehiculo.getModelo()+" // Puertas: "+vehiculo.getPuertas()+" // Precio: $"+vehiculo.getPrecio());
			}else {
				System.out.println("Marca: "+vehiculo.getMarca()+ " // Modelo: "+vehiculo.getModelo()+" // Cilindrada: "+vehiculo.getCilindrada()+" // Precio: $"+vehiculo.getPrecio());
			}
			
		}
		
		System.out.println("==============================================================================================");
		
		Collections.sort(vehiculos, (d1,d2)->{
			return (int) (d2.getPrecio() - d1.getPrecio());
		});
		System.out.println("Vehiculo más caro: " + vehiculos.get(0).getMarca()+ " "+vehiculos.get(0).getModelo());
		System.out.println("Vehiculo más barato: " + vehiculos.get(vehiculos.size()-1).getMarca()+ " "+vehiculos.get(vehiculos.size()-1).getModelo());
		
		for(Vehiculo vehiculo : vehiculos) {
			if (vehiculo.getModelo().startsWith("Y")) {
				System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+vehiculo.getMarca()+" "+vehiculo.getModelo()+" $"+vehiculo.getPrecio());
			}
		}
		
		System.out.println("===============================================================================================");
		
		System.out.println("Vehiculos ordenados por precio de mayor a menor");
		for(Vehiculo vehiculo : vehiculos  ) {
			System.out.println(vehiculo.getMarca()+" "+vehiculo.getModelo());
		}
	}

}
