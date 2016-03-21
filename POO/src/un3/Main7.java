package un3;
import javax.swing.JOptionPane;

public class Main7 {

	public static void main(String[] args) {

		Prog7 Mike=new Prog7();
		Mike.nombre=JOptionPane.showInputDialog("Nombre de Cliente: ");
		Mike.nCue=Integer.parseInt(JOptionPane.showInputDialog("Numero de Cuenta: "));


		//Static modCom from prog7 should be accessed by a Static way
		//el metodo statico modCom de prog7 deberia ser accesado de forma statica.
		Prog7.modCom(Double.parseDouble(JOptionPane.showInputDialog("Nueva Comision en %: ")));

		Mike.impDatos();
		Mike.AbonarCuenta(Double.parseDouble(JOptionPane.showInputDialog("Cantidad a Abonar: ")));
		Mike.RetirarEfectivo(Double.parseDouble(JOptionPane.showInputDialog("Cantidad a Retirar")));


		Mike.impresion();

	}

}