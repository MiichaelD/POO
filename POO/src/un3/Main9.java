package un3;

import javax.swing.JOptionPane;

public class Main9 {

		public static void main(String[] args) {

			Prog9 p=new Prog9("Michael Duarte",100000);
			JOptionPane.showMessageDialog(null,p.toString(),"Datos Empleado",JOptionPane.PLAIN_MESSAGE);


			Prog9 curri=new Prog9(5000);
			JOptionPane.showMessageDialog(null,curri.toString(),"Datos Empleado",JOptionPane.PLAIN_MESSAGE);

		}}