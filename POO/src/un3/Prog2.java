package un3;

import javax.swing.*;

public class Prog2 {
	JTextArea im=new JTextArea();

	public int calcularArea(int lado){
		int area;
		im.append("Area del Cuadrado:\n");
		area=lado*lado;
		im.append("\nLado del cuadrado:\t"+lado);
		im.append("\nArea del cuadrado:\t"+area);
		JOptionPane.showMessageDialog(null,im);
		return area;}

	public int calcularArea(int base, int altura){
		im.append("Area del Triangulo:\n");
		int area;
		area=(base*altura)/2;
		im.append("\nBase del Triangulo:\t"+base);
		im.append("\nAltura del Triangulo:\t"+altura);
		im.append("\nArea del Triangulo:\t"+area);
		JOptionPane.showMessageDialog(null,im);
		return area;}

	public double calcularArea(double radio,double pi){
		im.append("Area del Circulo:\n");
		double area;
		area=(pi*radio*radio);
		im.append("\nValor Pi :\t"+pi);
		im.append("\nRadio del O:\t"+radio);
		im.append("\nArea del O:\t"+area);
		JOptionPane.showMessageDialog(null,im);
		return area;}

	public void calcularArea(double base, int altura){
		im.append("Area del Rectangulo:\n");
		double area;
		area=(base*altura);
		im.append("\nBase del Rectangulo:\t"+base);
		im.append("\nAltura del Rectangulo:\t"+altura);
		im.append("\nArea del Rectangulo:\t"+area);
		JOptionPane.showMessageDialog(null,im);
		}

	}


