package un1;

import javax.swing.*;

public class Main9 {
	public static void main(String[] args) {
		JTextArea jo=new JTextArea();
		jo.append("Suma de 2 matrices.\n\n1er Matriz.\n");

		int mata[][]={{1,2,3},{4,5,6},{7,8,9}};
		int matb[][]={{1,2,3},{4,5,6},{7,8,9}};
		int matc[][]=new int [3][3];

		for(int f=0;f<mata.length;f++){
			for (int c=0;c<3;c++){

				if (c!=2){jo.append(mata[f][c]+" ");}
				else {jo.append(mata[f][c]+"\n");}
				}}jo.append("\n2da Matriz.\n");

		for(int f=0;f<matb.length;f++){
			for (int c=0;c<3;c++){

				if (c!=2){jo.append(matb[f][c]+" ");}
				else {jo.append(matb[f][c]+"\n");}
			}}jo.append("\n3ra Matriz.\n");

				for(int f=0;f<matc.length;f++){
					for (int c=0;c<3;c++){

				matc[f][c]=(mata[f][c]+matb[f][c]);
				if (c!=2){jo.append(matc[f][c]+" ");}
				else {jo.append(matc[f][c]+"\n");}
					}}
		JOptionPane.showMessageDialog(null,jo);


	}

}
