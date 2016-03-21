package un5;
import javax.swing.*;
public class Main02 {

	public static void main(String[] args) {
		Prog02Ejecutivo eje=new Prog02Ejecutivo();
		JTextArea j=new JTextArea();
		j.append("Ejecutivo Hereda de Empleado");

		eje.nombre="Michael Exe.";
		eje.sueldo=1000;
		eje.aumSueldo();
		eje.numEmple=(int)(Math.random()*100000);
		eje.asignarPresupuesto((int)(Math.random()*10000));
		j.append(eje.toString2());
		j.append("Presupuesto:\t"+eje.presupuesto);



		JOptionPane.showMessageDialog(null,j);
	}
}
