package examen;

import javax.swing.*;

public class Exa1 {


	public static void main(String[] args) {
		int mat[][]=new int [5][5];
		JTextArea im=new JTextArea();

			int i=0,par,imp=0;
			im.append("Matriz:\n\n");
		for (int f=0;f<mat.length;f++){
			for (int c=0;c<mat[0].length;c++){

				mat[f][c]=(int)(Math.random()*10);

				//comparacion par.
				par=mat[f][c]%2;
				if (par==0){i++;}
				else {imp++;}

				if(c==4){im.append(mat[f][c]+"\n");}
				else {im.append(mat[f][c]+"   ");}


			}}im.append("\n\nnumeros Pares: "+i+"\n"+"numeros Impares :"+imp);

		JOptionPane.showMessageDialog(null,im);
	}}
