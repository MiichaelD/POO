package un2;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Prog2 {

		char matriz[][]=new char[10][10],f=0,c=0;
		JTextArea j=new JTextArea();

		void titulo(){
		j.append("Diagonal Matriz=x\n\n");}

		void cicloMat(){
		for (f=0;f<matriz.length;f++){
			for (c=0;c<matriz[0].length;c++){

				if(f==c){matriz[f][c]='x';}

				else {matriz[f][c]='0';}

				j.append(matriz[f][c]+"    ");
				}j.append("\n");}}

		void impresion(){
		JOptionPane.showMessageDialog(null,j);}

		}


