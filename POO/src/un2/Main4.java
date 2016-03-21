package un2;
import javax.swing.*;
public class Main4 {
	//EjemploBanco;
	public static void main(String[] args) {

		Prog4 Mike=new Prog4();
		Mike.nombre=JOptionPane.showInputDialog("Nombre de Cliente: ");
		Mike.nCue=Integer.parseInt(JOptionPane.showInputDialog("Numero de Cuenta: "));
		Mike.saldo=Double.parseDouble(JOptionPane.showInputDialog("Saldo: "));;
		Mike.impDatos();

		Mike.AbonarCuenta(Double.parseDouble(JOptionPane.showInputDialog("Cantidad a Abonar: ")));
		Mike.RetirarEfectivo(Double.parseDouble(JOptionPane.showInputDialog("Cantidad a Retirar")));


		Mike.impresion();
	}

}
