package un5;
public class Prog13Recta extends Prog13Geo implements Inter12Dibujable{

	static int numRecta=0;
	protected double x1,y1;

	Prog13Recta(double x1,double y1){
		this.x1=x1;  this.y1=y1;
		numRecta++;	}


	Prog13Recta(){}

	public double Perimetro(){
		return (2.0*x1)+(2*y1);	}


	public double Area(){
		return (x1*y1);	}


	public String dibujar(){

		return "Soy Rectangulo:\n\t|xxxxxxxxxxxxxxx|\n\t|xxxxxxxxxxxxxxx|\n\t|xxxxxxxxxxxxxxx|";
	}



}
