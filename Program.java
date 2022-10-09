import ua.shapp.CostCalculator;
import java.util.Scanner;

class Program{
	
private final static int leg =4;

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter weight:");
		double weight = scanner.nextDouble();
		
		System.out.print("Enter kgPrice:");
		double kgPrice = scanner.nextDouble();
		
		System.out.print("Enter distance(int):");
		int distance = scanner.nextInt();
		
		System.out.print("Enter kmPrice:");
		double kmPrice = scanner.nextDouble();
		
		Table table = new Table(leg,weight);
		
		CostCalculator costC = new CostCalculator(kgPrice,kmPrice);
		
		double cost1 = costC.costCalc(table, distance);
	
		System.out.println(cost1);
	}
}