package un5;

public class Prog12Circulo implements Inter12Dibujable,Inter12Figura {

	private float radio;

	public Prog12Circulo(float radio){
		this.radio=radio;	}

	public float area(){
		return (float)(Math.PI*radio*radio);	}

	public String dibujar(){
		return "soy un circulo";	}


}

