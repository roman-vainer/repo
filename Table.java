import ua.shapp.Box;
public class Table implements Box{
	public int legs;
	public double weight;
	
	public Table(int legs, double weight){
		this.legs=legs;
		this.weight=weight;
	}
	
	public double getWeight(){
		return weight;
	}
}