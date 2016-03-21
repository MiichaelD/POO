package un1;
import javax.swing.*;
public class Main2 {

	public static void main(String[] args) {

		int i,sum=0;
		double prom;
		int nu[]=new int [100];
		//imprime promedio de vector
		JTextArea m=new JTextArea(15,5);
		JScrollPane sp=new JScrollPane(m);
		for (i=0;i<nu.length;i++){
			nu[i]=(int)(Math.random()*100);
			sum=sum+nu[i];
			m.append("numeros ["+ i +"] "+nu[i]+"\n");}

			prom=sum/nu.length;

			m.append("\nsuma total: "+sum+"\n");
			m.append("Promedio: "+prom);
			JOptionPane.showMessageDialog(null,sp);


		}

}

