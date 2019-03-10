package Recursion;

/**
 * @author Ali Azhari
 *
 */
public class Power {

	public static double Power1(int x, int n) {

		// Running time of this algorithm is O(n)

		if (n == 0)
			return 1;

		return x * Power1(x, n - 1);

	}
	
	
	/**
	 * The method Power2 is more efficient than the previous one.
	 * its running time is O(logn)
	 * @param x
	 * @param n
	 * @return
	 */
	public static double Power2(int x, int n) {

		// Running time of this algorithm is O(n)

		if (n == 0)
			return 1;
		else {
			double partial = Power2(x, n / 2);
			double result = partial * partial;
			if ((n % 2) == 1)
				result *= x;
			return  result;
		}


	}

	public static void main(String[] args) {

		long startTime, endTime, elapsedTime;
		
		
		// Getting power of 10 using power 1 with the running time O(n)
		startTime = System.currentTimeMillis();
		System.out.println("Power 10 of 10 using O(n) is: " + Power1(10, 10));
		endTime = System.currentTimeMillis();
		elapsedTime = endTime - startTime;
		System.out.println("The elapsed time  is: " + elapsedTime);
		
		// Getting power of 10 using power 2 with the running time O(logn)
		startTime = System.currentTimeMillis();
		System.out.println("Power 10 of 10 using O(n) is: " + Power2(10, 10));
		endTime = System.currentTimeMillis();
		elapsedTime = endTime - startTime;
		System.out.println("The elapsed time  is: " + elapsedTime);

	}

}
