
public class Calculator {
	
	public int add(int a, int b){
		return a+b;
	}
	public int subtract(int a, int b){
		return a-b;
	}
	public int multiply(int a, int b){
		return a*b;
	}
	public float divide(float a, float b){ //changed to float because it would be a fairly silly calculator if it couldn't calculate properly (assignment said to use int)
		return a/b;
	}
	public int square(int a){
		return a*a;
	}


	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(5, 23));
		System.out.println(calc.subtract(5, 23));
		System.out.println(calc.multiply(5, 23));
		System.out.println(calc.divide(5, 23));
		System.out.println(calc.square(5));
	}
}



