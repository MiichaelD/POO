package un2;
import javax.swing.*;
public class Main8 {

	public static void main(String[] args) {
		Prog8 Mike=new Prog8();

		Mike.nombre=JOptionPane.showInputDialog("Nombre de Cliente: ");
		Mike.nCue=Integer.parseInt(JOptionPane.showInputDialog("Numero de Cuenta: "));

		//error porqe saldo sale privado en prog 8 ,,, No es Visible.
		Mike.saldo=Double.parseDouble(JOptionPane.showInputDialog("Saldo: "));;
		Mike.saldoApertura(1000);

		Mike.impDatos();
		Mike.AbonarCuenta(Double.parseDouble(JOptionPane.showInputDialog("Cantidad a Abonar: ")));
		Mike.RetirarEfectivo(Double.parseDouble(JOptionPane.showInputDialog("Cantidad a Retirar")));
		
		//Static modCom from prog8 should be accessed by a Static way
		//el metodo statico modCom de prog8 deberia ser accesado de forma statica.
		Prog8.modCom(Double.parseDouble(JOptionPane.showInputDialog("Nueva Comision en %: ")));
		Mike.veriSaldo();

		Mike.impresion();

	}

}
