package un5;
import javax.swing.*;
public class Main09 {
	public static void main(String[] args) {
		JTextArea j=new JTextArea();


		Prog09Cir ci=new Prog09Cir(8,10,5);
		Prog09Cuad cu=new Prog09Cuad(8,10,5);

		j.append("ABSTRACTO\n\nArea Circulo:\t"+ci.area());
		j.append("\nArea Cuadro:\t"+cu.area());

		JOptionPane.showMessageDialog(null,j);

	}}
