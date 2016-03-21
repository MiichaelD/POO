package examen;

public class Exa56Tra extends Exa56Emple implements Exa56Puesto, Exa56Ingresos {

	double salario; 	int cantidad;
	String pri, seg;

	Exa56Tra(String pri, String seg, double s, int c){
		this.pri=pri; this.seg=seg; this.salario=s; this.cantidad=c;
	}
	public double ponerSalario(double s){
	if (s<0){salario+=0;}
	salario+=s;
	return salario;	}

	public int ponerCantidad(int c){
		if (c<0){cantidad+=0;}
		cantidad+=c;
		return cantidad;	}

	public double ingresos(){
		return cantidad*salario;	}

	public String puesto(){
		return "\nPuesto:\tSoy Trabajador";	}

	public String toString(){
		return "Trabajador:\t"+pri+" "+seg+"\n";	}
}




