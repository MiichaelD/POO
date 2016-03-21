package examen;
public class Exa3 {
//Vehiculos
	String modelo, color;
	int pasajeros,puertas;

	Exa3(int pasajeros, int puertas){
		this.pasajeros=pasajeros;
		this.puertas=puertas;
		this.modelo="Neon";
		this.color="Azul Marino";

	}
	Exa3(String modelo, String color){
		this.modelo=modelo;
		this.color=color;
		this.pasajeros=5;
		this.puertas=2;
	}

	public double CapaCombu(double litros){
		double capacidad,cilindros=4;
		capacidad=litros*cilindros;
		return capacidad;
	}
	public double CapaCombu(int cilindros){
		double capacidad,litros=10;
		capacidad=litros*cilindros;
		return capacidad;
	}

	public String velocidad(){
		int velocidad=220;
		return "Modelo:\t"+modelo+"\nColor:\t"+color+"\nPasajeros:\t"+pasajeros+"\nPuertas:\t"+puertas+"\nVelocidad:\t"+velocidad;
	}
}
