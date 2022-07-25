
public class MagicCalculator extends Calculator{

	public float sqrt(float a) {
		return (float) Math.pow(a,.5);
	}
	
	public float sin(float a) {
		return (float) Math.sin(a);
	}
	public float cosine(float a) {
		return (float) Math.cos(a);
	}
	public float tangent(float a) {
		return (float) Math.tan(a);
	}
	public float factorial(float a) { //recursive implementation of factorial
		if (a == 1) {
			return 1;
		}
		return(factorial(a-1)*a);
	}
	
	public static void main(String[] args) {
		MagicCalculator calc = new MagicCalculator();
		System.out.println(calc.add(5, 20)); //has functionality of Calculator class
		System.out.println(calc.sqrt(25));  
		
		System.out.println(calc.sin(90));  
		System.out.println(calc.cosine(90));  
		System.out.println(calc.tangent(90));  

		System.out.println(calc.factorial(10));
	}

}
