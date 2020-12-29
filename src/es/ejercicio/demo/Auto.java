package es.ejercicio.demo;

public class Auto implements Vehiculo {

	public String Marca;
	public String Modelo;
	public float Precio;
	public String Cilindrada;
	public int Puertas;
	
	public Auto(String marca, String modelo, int puertas, float precio) {
		Marca = marca;
		Modelo = modelo;
		Precio = precio;
		Puertas = puertas;
	}

	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return Marca;
	}

	@Override
	public String getModelo() {
		// TODO Auto-generated method stub
		return Modelo;
	}

	@Override
	public float getPrecio() {
		// TODO Auto-generated method stub
		return Precio;
	}

	@Override
	public int getPuertas() {
		// TODO Auto-generated method stub
		return Puertas;
	}

	@Override
	public String getCilindrada() {
		// TODO Auto-generated method stub
		return null;
	}


}
