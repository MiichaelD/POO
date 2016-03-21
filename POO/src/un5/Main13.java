package un5;
import javax.swing.*;
public class Main13 {

	public static void main(String[] args) {

		JTextArea i=new JTextArea();

		Prog13Recta R2=new Prog13Recta(10,20);

		i.append("RECTANGULO\n#Rectangulos\t"+Prog13Recta.numRecta+"\nPerimetro:\t"+R2.Perimetro()+"\nArea:\t"+R2.Area()+"\nDibujo:\t"+R2.dibujar());


		Prog13Cir	C2=new Prog13Cir(10);

		i.append("\n\nCIRCULO\n#Circulos\t"+Prog13Cir.numCir+"\nPerimetro:\t"+C2.Perimetro()+"\nArea:\t"+C2.Area()+"\nDibujo:\t"+C2.dibujar());
		JOptionPane.showMessageDialog(null,i);






	}

}
