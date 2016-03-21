package un5;
import javax.swing.*;
public class Main03 {
	public static void main(String[] args) {

		JTextArea im=new JTextArea();
		Prog03Trabaja   o1=new Prog03Trabaja("Mike","120");
		Prog03Empleado  o2=new Prog03Empleado("Juan","490",5000);
		Prog03Consultor o3=new Prog03Consultor("jose","120",40,150);

		im.append("Trabajador"+o1.toString());

		o2.calcularPaga();
		im.append("\n\nEmpleado"+o2.toString()+"\nEquals Mike:\t"+o1.equals(o2));

		o3.calcularPaga();
		im.append("\n\nConsultor"+o3.toString()+"\nEquals Mike:\t"+o1.equals(o3));

		JOptionPane.showMessageDialog(null,im);
	}}
