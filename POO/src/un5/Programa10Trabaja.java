package un5;
import javax.swing.*;
public class Programa10Trabaja {

	String nombre,	puesto="director",	direccion,	fechanaci,	fechacontra;
	int tel;
	String NSS;
	boolean compar;

	Programa10Trabaja(String nombre, String NSS){
		this.NSS=NSS;
		this.nombre=nombre;	}

	public boolean equals(Programa10Trabaja ob)throws MismaException{
		try{
			if (this.NSS.equals(ob.NSS)==true)throw new MismaException();	}
	catch (MismaException m){
			JOptionPane.showMessageDialog(null,"NSS iwales: Mike\n es iwal a: "+ob.nombre,"ERROR",JOptionPane.ERROR_MESSAGE);
			m.printStackTrace(); }

	return this.NSS.equals(ob.NSS);}

	public String toString(){
		return "\nNombre:\t"+nombre+"\nNSS:\t"+NSS;
	}


}
