package un1;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Main4 {

	
	public static void main(String[] args) {
		int i,sum=0,var;
		double prom;
		int nu[]=new int [10];


		JTextArea m=new JTextArea(1,10);
		for (i=0;i<11;i++){
			//como indicamos que seria un arreglo de 10 datos, & pusimos un 
			//ciclo de 11 datos, no habia otro lugar en el arreglo para asignarle
			//el ultimo valor por lo qe nos marca el siguiente error:
			//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
			//at un1.Main4.main(Main4.java:22)
			
			
			var=Integer.parseInt(JOptionPane.showInputDialog("introduce el dato "+i+":"));
			nu[i]=var;
			sum=sum+var;

			m.append("numeros ["+ i +"] "+nu[i]+"\n");}
			prom=sum/nu.length;

			m.append("\nsuma total: "+sum+"\n");
			m.append("Promedio: "+prom);
			JOptionPane.showMessageDialog(null,m);

	}

}
