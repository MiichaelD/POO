package un5;

public class Prog10Consultor extends Programa10Trabaja{

	int tarifa, horas;

	Prog10Consultor(String nombre, String NSS, int horas, int tarifa){
		super(nombre,NSS);
		this.nombre=nombre;
		this.NSS=NSS;
		this.horas=horas;
		this.tarifa=tarifa;	}

	public double calcularPaga(){
		return (horas*tarifa);	}

	public String toString(){
		return "\nNombre:\t"+nombre+"\nNSS:\t"+NSS;	}
}
