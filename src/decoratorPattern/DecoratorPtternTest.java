package decoratorPattern;

public class DecoratorPtternTest {
	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new
		BasicCar()));
		sportsLuxuryCar.assemble();
		}
}
