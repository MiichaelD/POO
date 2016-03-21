package un5;
public class Prog10Empleado extends Programa10Trabaja{

	double sueldo,impuestos;

	Prog10Empleado(String nombre,String NSS,double sueldo){
		super(nombre,NSS);
		this.nombre=nombre;
		this.NSS=NSS;
		this.sueldo=sueldo;
		impuestos=.3*sueldo;}

	public double calcularPaga(){
		sueldo-=impuestos;
		return sueldo;
	}

	public String toString(){
		return "\nNombre:\t"+nombre+"\nNSS:\t"+NSS;	}	}
