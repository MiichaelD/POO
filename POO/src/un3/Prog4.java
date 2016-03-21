package un3;
import javax.swing.*;
public class Prog4 {

	int x, y, suma=0;
	JTextArea J=new JTextArea();

	Prog4(int x, int y){
		this.x=x;
		this.y=y;}

	Prog4 (int suma, int x, int y){
		this.suma=suma;
		this.x=x;
		this.y=y;
	}

	public void Adicion(){
	J.append("Teniamos:"+suma);
	J.append("\nLe sumamos: "+x);
	J.append(" +  "+y);
	suma+=x+y;
	J.append("\nResultado: "+suma);
	JOptionPane.showMessageDialog(null,J);}

}
