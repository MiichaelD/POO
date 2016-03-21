package un5;

public class Prog13Cir extends Prog13Geo implements Inter12Dibujable{

	static int numCir=0;
	final double PI=Math.PI;
	double r;

	Prog13Cir(double r){
		this.r=r;
		numCir++;}

	Prog13Cir(){	}


	public double Perimetro(){
	return(2.0* PI * r );	}


	public double Area(){
		return( PI * r * r );	}

	public String dibujar(){
		return "Soy Circulo\n\tO";
	}


}
