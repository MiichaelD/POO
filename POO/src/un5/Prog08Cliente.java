package un5;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Prog08Cliente {
	//Cliente
	int nCue,i=0;	double saldo,cobCom;	String nombre; static double comision=10/100;
	JTextArea h=new JTextArea();

	public Prog08Cliente(){
		JOptionPane.showMessageDialog(null,"\nSe inicializa Saldo con 5000");
		saldo=5000;	}

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

	public void RetirarEfectivo(double cantidad) throws SaldoNoDisponibleException{
		if (cantidad>saldo){		throw new SaldoNoDisponibleException();}
		else{
		saldo-=cantidad;
		cobCom=(cantidad*comision);
		saldo-=cobCom;
		h.append("\nSe retiro:\t-"+cantidad);
		h.append("\nComision:\t-"+cobCom);
		h.append("\nNuevo Saldo:\t"+saldo);}}

	public void impresion(){
		JOptionPane.showMessageDialog(null,h,"Estado de Cuenta",JOptionPane.INFORMATION_MESSAGE);}}

