package un5;
import javax.swing.*;
public class Prog11VariosCatch {
		public static void main(String[] args)  {
		JTextArea salida =new JTextArea(10,10);
		salida.append("<<< MENU PRINCIPAL >>>  \n");
		salida.append("  1. Interface 1     \n");
		salida.append("  2. Interface 2 \n");
		salida.append("  3. SALIDA      \n");
		int opcion = 0;
		do{
			try{
			 opcion=Integer.parseInt(JOptionPane.showInputDialog(salida));
		  switch(opcion)
		  {
			case 1:un5.Main12.main(args);
		    break;
			case 2:un5.Main13.main(args);
		    break;
			case 3:System.exit(0);
			default:
		  }
		    if(opcion>3) {throw new NomayorOPCIONException();}
			}catch(  NomayorOPCIONException  x)	{JOptionPane.showMessageDialog(null,"Opcion No Menor a 1 \n& no Mayor a 3");}
			catch(NumberFormatException e)		{JOptionPane.showMessageDialog(null,"SOLO NUMEROS");}
		 } while(opcion!=3);
		 JOptionPane.showMessageDialog(null,salida);
		}}
