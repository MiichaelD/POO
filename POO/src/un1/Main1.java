package un1;

import javax.swing.*;

public class Main1 {

	public static void main(String[] args) {
		int i=0;
		int num[]=new int [10];
		JTextArea m=new JTextArea();
		m.append("valores = posiciones\n");

		for (i=0;i<10;i++){
			num[i]=i;}

		for (i=0;i<10;i++){
			m.append("numeros ["+ i +"] "+num[i]+"\n");
			}JOptionPane.showMessageDialog(null,m);
	}
}
