package un1;

import javax.swing.*;

public class Main10 {


	public static void main(String[] args) {

		int v[]=new int [6];
		int m[][]=new int [2][3];
		JTextArea j=new JTextArea();
		int var;
		j.append("Impares Vector-->Matriz\n\n Vector:\n");
		
		for (int i=0;i<v.length;i++){
			var=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor "+i+":"));
			if (var%2!=0){v[i]=var;	j.append(v[i]+"\n");}
			else i--;
		}j.append("\n");
		j.append("Matriz:\n");
		int i=0;
		
		for (int f=0;f<m.length;f++){
			for(int c=0;c<m[0].length;c++){

				m[f][c]=v[i];
				i++;

				if (c!=2)j.append(m[f][c]+" ");
				else j.append(m[f][c]+"\n");

			}}JOptionPane.showMessageDialog(null,j);
	}}
