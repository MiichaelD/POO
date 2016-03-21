package un1;

import javax.swing.*;

public class Main7 {
	public static void main(String[] args) {
	int matriz[][]=new int[10][10];

	int f=0,c=0;
	JTextArea j=new JTextArea();
	j.append("Matriz prog 7:\n\n");
	
	for (f=0;f<matriz.length;f++){
		for (c=0;c<matriz[0].length;c++){
			
			if(f==c){matriz[f][c]=1;}

			else {matriz[f][c]=0;}

			if (c!=matriz[0].length-1) {j.append(matriz[f][c]+" ");}
			else {j.append(matriz[f][c]+"\n");}
		}	}
	JOptionPane.showMessageDialog(null,j);

	}

}
