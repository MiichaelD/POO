package un5;

public class Prog12Cuad implements Inter12Dibujable,Inter12Rotable,Inter12Figura {
    private double lado;

    public Prog12Cuad(double lado){

    	this.lado=lado;
    }
    public float area(){

    	return (float)(lado*lado);

    }
    public String dibujar(){

		return "soy un cuadrado";

	}

    public String rotar(){
    	return "NO PUEDO ROTAR";


    }

}
