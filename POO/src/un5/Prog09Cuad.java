package un5;
public class Prog09Cuad extends Prog09Fig{

	public double lado;
	public Prog09Cuad(double x, double y, double lado){
		super(x,y);
		this.lado=lado;	}

	public double area(){
		return lado*lado;
	}

}
