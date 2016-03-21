package un5;

public class Prog03Trabaja {

	String nombre,	puesto="director",	direccion,	fechanaci,	fechacontra;
	int tel;
	String NSS;
	boolean compar;

	Prog03Trabaja(String nombre, String NSS){
		this.NSS=NSS;
		this.nombre=nombre;	}

	public boolean equals(Prog03Trabaja ob){
	return this.NSS.equals(ob.NSS);	}

	public String toString(){
		return "\nNombre:\t"+nombre+"\nNSS:\t"+NSS;
	}


}
