package Recursion;

/**
 * @author Ali Azhari
 *
 */
public class Factorial {

	public static int Fact(int n) throws IllegalArgumentException {
		
		// Running time of factorial: O(n) 
		
		if (n < 0) throw new IllegalArgumentException();
		
		if (n == 0) return 1;
		
		return (n * Fact(n - 1));
		
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 11; i++)
		System.out.println("Factorial of " + i + " :" + Fact(i));

	}

}
