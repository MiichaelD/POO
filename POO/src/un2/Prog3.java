package un2;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Prog3 {

	int mata[][]={{1,2,3},{4,5,6},{7,8,9}};
	int matb[][]=new int [3][3];

	JTextArea ji=new JTextArea();

	public void titulo(){
	ji.append("Matrices Traspuestas.\n\n Matriz original.\n");}

	public void MatOri(){
	for (int f=0;f<mata.length;f++){
		for (int c=0;c<mata[0].length;c++){

			if (c==mata[0].length-1){
				ji.append(mata[f][c]+"\n");}
			else {ji.append(mata[f][c]+" ");}}}}

	public void AsiMat(){
	ji.append("\nMatriz Traspuesta.\n");
	for (int f=0;f<mata.length;f++){
		for (int c=0;c<mata[0].length;c++){
			matb[f][c]=mata[c][f];

			if (c==mata[0].length-1){
				ji.append(matb[f][c]+"\n");}
			else {ji.append(matb[f][c]+" ");}}}}

	public void impres(){
		JOptionPane.showMessageDialog(null,ji);}

}

