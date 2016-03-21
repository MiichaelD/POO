package examen;
//import javax.swing.*;
public class Exa2a {

	public static void main(String[] args) {
		Exa2 ex=new Exa2();

		ex.nomCli="Michael";
		ex.nomArt="pizarrones";
		Exa2.iva=.08;
		Exa2.interes=.04;

		ex.pagarContado(10,5);
		ex.pagarCredito(10, 5, 12);






	}}
