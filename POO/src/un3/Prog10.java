package un3;

public class Prog10 {
//alumno
	enum Horario{manana,tarde}//posibles horarios
	String nombre,apellidos,grupo;
	int anoNacim,numPersonal;
	Horario horario=Horario.manana;//instanciamos horario ma�ana


	Prog10(String nombre, String apellidos, int ano){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.anoNacim=ano;	}

	Prog10(String nombre, int ano){
		this.nombre=nombre;
		this.anoNacim=ano;	}

	public void grupo(String grupo,Horario horario){
		this.grupo=grupo;
		this.horario=horario;	}

	public void grupo(String grupo){
		this.grupo=grupo;

	}}
