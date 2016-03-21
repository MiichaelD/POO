package examen;
import javax.swing.*;
public class Exa56a {

	public static void main(String[] args) {
		JTextArea imprimir=new JTextArea();
		Exa56Tra t=new Exa56Tra("Laura","Flores",3.5,300);
		t.ponerSalario(0.0);
		t.ponerCantidad(0);
		t.carro="\nHere Emple:\tTe doy mi carro";
		imprimir.append(t.toString()+"Ingresos:\t"+t.ingresos()+t.puesto()+t.carro);

		JOptionPane.showMessageDialog(null,imprimir);

	}

}
