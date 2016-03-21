package un1;

import javax.swing.*;

public class Main6 {

	public static void main(String[] args) {
		JTextArea x=new JTextArea (10,10);
		int nums[]=new int [8];
				int a, b, acu,i;

x.append("Metodo Burbuja\n\n Vector Original:\n");
//asignando balores al vector.
				for(i=0; i<nums.length; i++){
					nums[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor "+i+": "));
					x.append(i+".- "+nums[i]+"\n");//imprimiendo vector
				}x.append("\n");
//metodo burbuja...:
				for(a=1; a<nums.length; a++)//empezamos ciclo con 1, asta qe llegue a -1 de vector.
				for(b=nums.length-1; b>=a; b--)//empezamos ciclo con -1 de vector, hasta qe sea iwal a A.
				{if(nums[b-1] > nums[b]) { // si b-1 es menor qe b. se le asigna el balor al acu.
				acu= nums[b-1];
				nums[b-1] = nums[b];/// se intercambian valores.
				nums[b] = acu;
				}}

//				asignando valor a vector ordenado
				x.append("\n Vector Ordenado\n");
				for( i=0; i <nums.length; i++){
					x.append(i+".- "+nums[i]+"\n");
				}
				JOptionPane.showMessageDialog(null,x);//imprimo todo
				}



}
