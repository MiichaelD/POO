package un2;

public class Prog6 {
	//promedio
	
	public static int media(int datos[]){
		int suma=0,n=datos.length;
		for (int i=0;i<n;i++){
			suma+=datos[i];
		}return suma/n;
	}

}