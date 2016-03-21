package un2;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Prog8 {
	//Cliente//
	int nCue,i=0;	double saldo;	double cobCom;	
	String nombre; static double comision=.05;
	static JTextArea h=new JTextArea();

	public void impDatos(){
		h.append("Nombre:\t"+nombre);
		h.append("\nNo.Cuenta:\t"+nCue);
		h.append("\nCom. Ante:\t"+comision);
		h.append("\nSaldo:\t"+saldo);}

	public void AbonarCuenta(double cantidad){
		saldo+=cantidad;
		h.append("\nSe abono:\t+"+cantidad);
		h.append("\nNuevo Saldo:\t"+saldo);}

	public void RetirarEfectivo(double cantidad){
		if (cantidad>saldo){JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
		JOptionPane.showMessageDialog(null,h,"Estado de Cuenta",JOptionPane.INFORMATION_MESSAGE);}
		else{saldo-=cantidad;
		h.append("\nSe retiro:\t-"+cantidad);
		h.append("\nNuevo Saldo:\t"+saldo);}}

	//metodo statico
	public static double modCom(double ncom){
		comision=ncom/100;
		h.append("\nNueva Com:\t"+comision);
		return comision;}

	public void saldoApertura(double saldoAp){
		saldo=saldoAp;}

	public double veriSaldo(){
		cobCom=saldo*comision;
		h.append("\nCom. de verif:\t-"+cobCom);
		saldo-=cobCom;
		h.append("\nSaldo Actual:\t"+saldo);
		return saldo;}

	public void impresion(){
		JOptionPane.showMessageDialog(null,h,"Estado de Cuenta",JOptionPane.INFORMATION_MESSAGE);}

}
