package un5;

public class Prog03Consultor extends Prog03Trabaja{


	int tarifa, horas;


	Prog03Consultor(String nombre, String NSS, int horas, int tarifa){
		super(nombre,NSS);
		this.nombre=nombre;
		this.NSS=NSS;
		this.horas=horas;
		this.tarifa=tarifa;
	}

	public double calcularPaga(){
		return (horas*tarifa);

	}

	public String toString(){
		return "\nNombre:\t"+nombre+"\nNSS:\t"+NSS;
	}

}
