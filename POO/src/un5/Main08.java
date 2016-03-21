package un5;

import javax.swing.JOptionPane;

public class Main08 {

	public static void main(String[] args) {
		try{
		Prog08Cliente Mike=new Prog08Cliente();
		Mike.nombre="Michael";
		Mike.nCue=(int)(Math.random()*100);
		Prog08Cliente.modCom(5);
		Mike.impDatos();
		Mike.AbonarCuenta(Double.parseDouble(JOptionPane.showInputDialog("Cantidad a Abonar: ")));
		Mike.RetirarEfectivo(Double.parseDouble(JOptionPane.showInputDialog("Cantidad a Retirar")));
		Mike.impresion();
		//se puede utilizar de esta forma:
		//}catch (SaldoNoDisponibleException m){

			//JOptionPane.showMessageDialog(null,"Saldo Insuficiente, No hay retiro.");
			//m.printStackTrace();

		//o de la siguiente forma:
		   } catch(Exception m){
		   		m.printStackTrace();
		   		JOptionPane.showMessageDialog(null,"Saldo Insuficiente, No hay retiro.");

		}}}
