package un2;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Prog7 {
	//Cliente
	int nCue,i=0;	double saldo,cobCom;	String nombre; static double comision=10/100;
	JTextArea h=new JTextArea();

	public void impDatos(){

		h.append("Nombre:\t"+nombre);
		h.append("\nNo.Cuenta:\t"+nCue);
		h.append("\nSaldo:\t"+saldo);
		h.append("\nComision del\t"+comision);}

	public void AbonarCuenta(double cantidad){
		saldo+=cantidad;
		h.append("\nSe abono:\t+"+cantidad);
		h.append("\nNuevo Saldo:\t"+saldo);}

	//metodo statico
	public static double modCom(double ncom){
		comision=ncom/100;
		return comision;}

	public void RetirarEfectivo(double cantidad){
		if (cantidad>saldo){JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
		JOptionPane.showMessageDialog(null,h,"Estado de Cuenta",JOptionPane.INFORMATION_MESSAGE);}
		else{
		saldo-=cantidad;
		cobCom=(cantidad*comision);
		saldo-=cobCom;
		h.append("\nSe retiro:\t-"+cantidad);
		h.append("\nComision:\t-"+cobCom);
		h.append("\nNuevo Saldo:\t"+saldo);}}

	public void impresion(){
		JOptionPane.showMessageDialog(null,h,"Estado de Cuenta",JOptionPane.INFORMATION_MESSAGE);}}



