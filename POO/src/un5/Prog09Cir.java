package un5;
public class Prog09Cir extends Prog09Fig{
	public double radio;

	public Prog09Cir(double x, double y, double radio){
		super(x,y);
		this.radio=radio;	}

	public double area(){
		return Math.PI*radio*radio;	}

}
