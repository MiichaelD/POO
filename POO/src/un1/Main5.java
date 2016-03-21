package un1;
import javax.swing.*;
public class Main5 {

	public static void main(String[] args) {
		JTextArea p=new JTextArea();
		int valores[]={1,2,3,4,5,6,7,8};
		int var,i;
		p.append("Todos los Valores\n");
		for (i=0;i<valores.length;i++){
			p.append("Posicion "+i+":  "+ valores[i]+"\n");}

		for (int n=1;n<=1;n++){	var=Integer.parseInt(JOptionPane.showInputDialog("dame un numero :"));
		for (int m=0;m<valores.length;m++){
			if (var==valores[m]){n++;
			p.append("El dato se encuentra en la posicion: "+m);
			JOptionPane.showMessageDialog(null, p);		}}
		n--;}
		}}
