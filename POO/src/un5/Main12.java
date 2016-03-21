package un5;
import javax.swing.*;
public class Main12 {
	public static void main(String args[]){

		Prog12Circulo ci =new Prog12Circulo(5);
		Prog12Cuad cu =new Prog12Cuad(5);
		JTextArea  wa=new JTextArea();

		wa.append("Circulo:\nArea=" + ci.area()+"\n" + ci.dibujar() );
		wa.append("\n\nCuadro:\nArea=" + cu.area()+"\n"+cu.dibujar()+"\n"+cu.rotar());

		JOptionPane.showMessageDialog(null,wa);

	}}