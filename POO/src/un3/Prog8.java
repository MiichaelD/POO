package un3;

public class Prog8 {
// empleado;

	String nombre; int numEmple, sueldo, aumento;

	static int conta=0;

	Prog8(String nombre, int sueldo){
		this.nombre=nombre;
		this.sueldo=sueldo;
		numEmple=++conta;	}

	public void aumSueldo(int porcentaje){
		sueldo+=sueldo*porcentaje;}

	public String toString(){
		return "Num. empleado:\t "+numEmple+"\nNombre\t: "+nombre+"\nSueldo:\t "+sueldo+"\n";}




}
