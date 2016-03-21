package un5;
import javax.swing.*;
public class Main10 {
	public static void main(String[] args) throws MismaException {

	JTextArea im=new JTextArea();
	Programa10Trabaja   o1=new Programa10Trabaja("Mike","120");
	Prog10Empleado  	o2=new Prog10Empleado("Juan","1200",5000);
	Prog10Consultor 	o3=new Prog10Consultor("jose","1209",40,150);

	im.append("Trabajador"+o1.toString());

	o2.calcularPaga();
	im.append("\n\nEmpleado"+o2.toString()+"\nEquals Mike:\t"+o1.equals(o2));

	o3.calcularPaga();
	im.append("\n\nConsultor"+o3.toString()+"\nEquals Mike:\t"+o1.equals(o3));

	JOptionPane.showMessageDialog(null,im);
	}}
