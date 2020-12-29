package es.ejercicio.demo;

public class Moto implements Vehiculo {

	public String Marca;
	public String Modelo;
	public float Precio;
	public String Cilindrada;
	
	public Moto(String marca, String modelo, String cilindrada, float precio) {
		Marca = marca;
		Modelo = modelo;
		Precio = precio;
		Cilindrada = cilindrada;
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
		return 0;
	}

	@Override
	public String getCilindrada() {
		// TODO Auto-generated method stub
		return Cilindrada;
	}

}
