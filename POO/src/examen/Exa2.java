package examen;

import javax.swing.*;

public class Exa2 {
//CLASE VENTAS:
	JTextArea im=new JTextArea();
	JTextArea in=new JTextArea();
	String nomCli,nomArt;
	double total;
	static double iva;
	static double interes;
	public double acum;


	public void pagarContado(double precio,int cant){
		im.append("PAGO A CONTADO:\n");
		im.append("\nCliente:\t"+nomCli);
		im.append("\nArticulo:\t"+nomArt);
		im.append("\nPrecio:\t"+precio);
		im.append("\nCantidad:\t"+cant);

		total=precio*cant;
		iva=iva*total;
		im.append("\nIVA:\t"+iva);
		total+=iva;
		im.append("\nTOTAL:\t"+total);

		JOptionPane.showMessageDialog(null,im);

	}
	public double pagarCredito(double precio, double cant, int meses){
		total=0;
		in.append("PAGO A CREDITO:\n");
		in.append("\nCliente:\t"+nomCli);
		in.append("\nArticulo:\t"+nomArt);
		in.append("\nMeses:\t"+meses);
		in.append("\nPrecio:\t"+precio);
		in.append("\nCantidad:\t"+cant);


		total=precio*cant;
		iva=.08*total;
		in.append("\nIVA:\t"+iva);
		total+=iva;
		//total=540


		for (int i=1;i<=2;i++){
			acum=interes*total;
			total+=acum;
		}
		in.append("\nIntereses:\t"+acum);
		in.append("\nTOTAL:\t"+total);

		JOptionPane.showMessageDialog(null,in);

		return total;
	}


}
