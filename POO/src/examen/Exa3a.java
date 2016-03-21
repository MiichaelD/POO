package examen;
import javax.swing.*;
public class Exa3a {
	public static void main(String[] args) {
		JTextArea j=new JTextArea();
		JTextArea o=new JTextArea();

		Exa3 o1=new Exa3("Focus","Plateado");
		Exa3 o2=new Exa3(6,4);

		o1.CapaCombu(5.0);//litros
		j.append(o1.velocidad());
		j.append("\nCapacidad:\t"+o1.CapaCombu(5.0));

		o2.CapaCombu(4);//cilindros
		o2.velocidad();
		o.append(o2.velocidad());
		o.append("\nCapacidad:\t"+o2.CapaCombu(4));

		JOptionPane.showMessageDialog(null,j);
		JOptionPane.showMessageDialog(null,o);

	}

}
