package un5;

public class Prog02Empleado {

	String nombre; int numEmple;
	double porcentaje=.05, sueldo;

	int conta=0;



	public void aumSueldo(){
		sueldo=sueldo+(sueldo*porcentaje);}

	public String toString(){
		return "\n# Emp.:\t "+numEmple+"\nNombre:\t "+nombre+"\nSueldo:\t "+sueldo+"\n";}


}
