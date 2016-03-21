package un2;

import javax.swing.*;

public class Prog4 {
//Cliente
	int nCue,i=0;
	double saldo;
	String nombre;
JTextArea h=new JTextArea();
	public void impDatos(){

		h.append("Nombre:   \t"+nombre);
		h.append("\nNo.Cuenta: \t"+nCue);
		h.append("\nSaldo  :\t"+saldo);	}

	public void AbonarCuenta(double cantidad){
		saldo+=cantidad;
		h.append("\nSe abono: +"+cantidad+"\nNuevo Saldo: "+saldo);	}

	public void RetirarEfectivo(double cantidad){
		if (cantidad>saldo){JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
		JOptionPane.showMessageDialog(null,h,"Estado de Cuenta",JOptionPane.INFORMATION_MESSAGE);}
		else{
		saldo-=cantidad;
		h.append("\nse retiro efectivo: -"+cantidad+"\nNuevo Saldo: "+saldo);}}

	public void impresion(){
		JOptionPane.showMessageDialog(null,h,"Estado de Cuenta",JOptionPane.INFORMATION_MESSAGE);}}
