package un3;
import javax.swing.*;
import un3.Prog10.Horario;
public class Main10 {

	public static void main(String[] args) {
		Prog10 a=new Prog10("Michael","Duarte Pena",91);
			a.grupo("Lab 26",Horario.manana);
			JOptionPane.showMessageDialog(null,a.grupo+"\t "+a.horario);

			a.grupo("LAB 26");
			JOptionPane.showMessageDialog(null,a.nombre+"\t "+a.apellidos+" \t "+a.anoNacim+"\nGrupo "+ a.grupo+"\nHorario "+a.horario);

		Prog10 b=new Prog10("Bianca Moya Gonzalez",91);
			b.grupo("LAB 5",Horario.tarde);
			JOptionPane.showMessageDialog(null,b.grupo+"\t "+b.horario);

			b.grupo("LAB 5");
			JOptionPane.showMessageDialog(null,b.nombre+"\t "+b.anoNacim+"\nGrupo "+ b.grupo+"\nHorario "+b.horario);
	}}
