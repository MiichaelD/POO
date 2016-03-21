package un2;

import javax.swing.*;

public class Prog1 {


	private int i=0, num[]=new int [10];
	JTextArea m=new JTextArea();
	public void impresTitulo(){
	m.append("valores = posiciones\n\n");}

	public void ciclo(){
		for (i=0;i<10;i++){
			num[i]=i;}}

	public void impresion(){
		for (i=0;i<10;i++){
			m.append("numeros ["+ i +"] "+num[i]+"\n");}
			JOptionPane.showMessageDialog(null,m);}}

