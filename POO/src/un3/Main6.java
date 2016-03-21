package un3;

import javax.swing.*;

public class Main6 {	
	
	public static void main(String[] args) {
	JTextArea m=new JTextArea();
		Prog6 mike=new Prog6("Michael","ITMexicali",18);
		
		m.append("Nombre: "+mike.nombre+"\nEmpresa: "+mike.nombreEmpresa+"\nEdad: "+mike.edad);
		JOptionPane.showMessageDialog(null,m,"Datos de Persona",JOptionPane.PLAIN_MESSAGE);
	}}
