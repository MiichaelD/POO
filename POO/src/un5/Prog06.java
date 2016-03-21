package un5;
import javax.swing.JOptionPane;
public class Prog06 {

	public static void main(String args[]){

	try{
		JOptionPane.showMessageDialog(null,"Antes de Lanzar","TRY",JOptionPane.PLAIN_MESSAGE);
	  throw new ArithmeticException();
		}
		catch(ArithmeticException e){   //ATRAPA EXCEPCION
	     JOptionPane.showMessageDialog(null,"Excepcion Cachada","TRY",JOptionPane.PLAIN_MESSAGE);}

		JOptionPane.showMessageDialog(null,"DESPUES DEL BLOQUE try/cath","TRY",JOptionPane.PLAIN_MESSAGE);

			  	  	}}



