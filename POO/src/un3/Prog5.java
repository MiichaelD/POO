package un3;
import javax.swing.*;
public class Prog5 {

	int var,i,j;
	int valores[]=new int[6];
	JTextArea p=new JTextArea();

	Prog5(int j){
		this.j=j;
		for (i=0;i<valores.length;i++){
		valores[i]=i*j;}		}

	Prog5(int n, int var){
		this.j=n;
		for (i=0;i<valores.length;i++){
			valores[i]=i*j;}	}


	public void asigVal(){
		p.append("Todos los Valores\n");
	for (i=0;i<valores.length;i++){
		p.append("Posicion "+i+":  "+ valores[i]+"\n");}
	JOptionPane.showMessageDialog(null, p);}}