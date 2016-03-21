package un5;

import javax.swing.*;

public class Main01 {
	public static void main(String[] args) {

		Prog01Empleado Ob=new Prog01Empleado();
		JTextArea j=new JTextArea();

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

		JOptionPane.showMessageDialog(null,j);

	}}
