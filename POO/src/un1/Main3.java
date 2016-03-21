package un1;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Main3 {


	public static void main(String[] args) {
		// cual es el menor y mayor dato
		
		int nu[]=new int [5];
		int i,var,min,max;

		JTextArea m=new JTextArea(1,10);
	
		
		for (i=0;i<nu.length;i++){
			var=Integer.parseInt(JOptionPane.showInputDialog("introduce el dato "+i+":"));
			nu[i]=var;
			m.append("numeros ["+ i +"] "+nu[i]+"\n");}
		
		min=nu[0];
		max=nu[0];
		for (i=0;i<nu.length;i++){			
			if (nu[i]<min) {min=nu[i];}
			if (nu[i]>max) {max=nu[i];}
		}
			m.append("el valor maximo: "+max+"\n");
			m.append("el valor minimo: "+min+"\n");
			
			JOptionPane.showMessageDialog(null,m);
		
	}

}
