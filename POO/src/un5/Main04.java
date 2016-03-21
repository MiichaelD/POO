package un5;
import javax.swing.*;
public class Main04 {
	public static void main(String[] args) {
		Prog04Emple Ob=new Prog04Emple();
		Prog04Boss Oj=new Prog04Boss();
		JTextArea j=new JTextArea();
		//Empleado//
		j.append("Empleado hereda a Persona");
		Ob.nombre="Juan";
		j.append("\nNombre:\t"+Ob.nombre);

		Ob.edad=(int)(Math.random()*100);
		j.append("\nedad:\t"+Ob.edad);

		Ob.tel=5616263;
		j.append("\ntel:\t"+Ob.tel);

		Ob.email="juan.jjbu@hotline.es";
		j.append("\ne-mail:\t"+Ob.email);

		Ob.nomEmpleado=(int)(Math.random()*10000);
		j.append("\n# Empleado:\t"+Ob.nomEmpleado);

		Ob.depto="Sistemas Compu";
		j.append("\nDepto:\t"+Ob.depto);

		Ob.sueldo=5000;
		j.append("\nSueldo:\t"+Ob.sueldo);

		j.append("\nTrabaja:\t"+Ob.trabaja("Aflojerado"));


		//BOSSSS//
		j.append("\n\nBoss Hereda de Perona");
		Oj.nombre="Mike";
		Oj.edad=(int)(Math.random()*100);
		j.append("\nedad:\t"+Oj.edad);

		Oj.tel=5689978;
		j.append("\ntel:\t"+Oj.tel);

		Oj.email="Michael_msdp@dispostable.com";
		j.append("\ne-mail:\t"+Oj.email);

		Oj.nomEmpleado=(int)(Math.random()*10000);
		j.append("\n# Empleado:\t"+Oj.nomEmpleado);

		Oj.depto="Direccion General";
		j.append("\nDepto:\t"+Oj.depto);

		Oj.sueldo=100000;
		j.append("\nSueldo:\t"+Oj.sueldo);

		j.append("\nTrabaja:\t"+Oj.trabaja("Duro"));


		JOptionPane.showMessageDialog(null,j);
	}}
