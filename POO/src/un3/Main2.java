package un3;
import javax.swing.*;
public class Main2 {

public static void main(String[] args) {
		Prog2 x=new Prog2();
		int opcion;
		do{
			opcion=Integer.parseInt(JOptionPane.showInputDialog("Introduce Opcion\n1.- Cuadrado\n2.-Triangulo\n3.-Circulo.\n4.-Rectangulo.\n0.Salir"));
		switch(opcion){
		case 1: x.calcularArea(Integer.parseInt(JOptionPane.showInputDialog("Lado: ")));break;
		case 2: x.calcularArea(Integer.parseInt(JOptionPane.showInputDialog("Base: ")), Integer.parseInt(JOptionPane.showInputDialog("Altura: ")));break;
		case 3: x.calcularArea(Double.parseDouble(JOptionPane.showInputDialog("Radio: ")),3.1416);break;
		case 4: x.calcularArea(Integer.parseInt(JOptionPane.showInputDialog("Base: ")), Integer.parseInt(JOptionPane.showInputDialog("Altura: ")));break;
		case 0: System.exit(0);break;
		default: JOptionPane.showMessageDialog(null,"Opcion Incorrecta");break;}}
		while(opcion!=0);
}}
