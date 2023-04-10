public class Calculator {
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double subtract(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double division(double num1, double num2) {
		return num1 / num2;
	}
	
	public static double modulo(double num1, double num2) {
		return num1 % num2;
	}

    public static void main(String[] args) {
        System.out.println(Calculator.add(10, 5)); // output: 15.0
        System.out.println(Calculator.subtract(10, 5));// output: 5.0
        System.out.println(Calculator.multiply(10, 5));// output: 50.0
        System.out.println(Calculator.division(10, 5));// output: 2.0
        System.out.println(Calculator.modulo(10, 5));// output: 0.0
//        Calculator.calculate(10, 5, "$"); // output: Invalid operator!
    }
}
