package un5;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Prog07 {

	JTextArea m=new JTextArea();
	int i=0;
	int num[]=new int [10];

	public void metodo(){
		m.append("valores = posiciones\n");
		for (i=0;i<15;i++){try{
				num[i]=i;

				m.append("numeros ["+ i +"] "+num[i]+"\n");}

	catch(ArrayIndexOutOfBoundsException a){

				m.append("\nFuera del limite en posicion: "+i+"\npq vector es de 10 datos\n");}}

		JOptionPane.showMessageDialog(null,m);

	}}
