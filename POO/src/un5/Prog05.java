package un5;

import javax.swing.JOptionPane;

public class Prog05 {

	public static void main (String args[]){


  	    int A1[]={4,8,16,32,64,128};
  	    int A2[]={2,0,4,4,0,8};

  	    for(int i=0;i<A1.length;i++){

  	    	try{

  	    	JOptionPane.showMessageDialog(null, A1[i]  + " / " +  A2[i] + " = " +  A1[i] / A2[i] , "Division" ,JOptionPane.PLAIN_MESSAGE);

  	    	} catch(ArithmeticException e){//ATRAPA LA EXCEPCION
  	    	JOptionPane.showMessageDialog(null, A1[i]  + " / " +  A2[i] + "\nERROR: Indeterminacion"," Excepcion ",JOptionPane.PLAIN_MESSAGE);
  	    	}}}}


