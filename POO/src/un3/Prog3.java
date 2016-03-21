package un3;
import javax.swing.*;
public class Prog3 {
	int y, result;
	JTextArea salida;
	JScrollPane barra;
	
	Prog3(){
		salida=new JTextArea(5,10);
		barra=new JScrollPane(salida);
		result=0;		
	}
	
	void elevar(int x, int y){
		result=(int)Math.pow(x,y);{
			salida.append("El numero 4 elevado a x potencia "+x+"^"+y+"= "+result+"\n");
		}	}
	
	void elevar(int x){
		y=Integer.parseInt(JOptionPane.showInputDialog("Dame la potencia"));
		result=(int)Math.pow(x,y);{
			salida.append("El numero 4 elevado a x potencia "+y+"= "+result+"\n");
		}	}
	
	void pegar(){
		JOptionPane.showMessageDialog(null,barra);	}
	}
