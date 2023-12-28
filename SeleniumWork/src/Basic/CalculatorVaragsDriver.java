package Basic;

public class CalculatorVaragsDriver {
	public static void main(String[] args) {

		CalculatorVarargs c = new CalculatorVarargs();
		System.out.println(c.add(10, 20));
		System.out.println(c.add(20.5, 10, -4.5, 12));
		System.out.println(c.sub(30, 20));
	}
}