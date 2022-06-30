package InsertionSort;

import java.util.Arrays;

/**
 * @author Ali Azhari
 *
 */
public class InsertionSort {
	

	public static void InsertionSort(char[] data) {
		
		// running time: O(n2)
		
		int length = data.length;
		if (length < 2) return;
		for (int i = 1; i < length; i++) {
			char current = data[i];
			int j = i;
			while (j > 0 && data[j - 1] > current) {
				data[j] = data[j-1]; 
				j--; 
			}
			data[j] = current;
				
		}
	}
	
	public static void main(String[] args) {
		char[] data = {'F', 'J', 'T', 'W', 'X', 'A', 'T', 'V'};
		System.out.println(Arrays.toString(data));
		System.out.println("Before Insertion Sort:" + Arrays.toString(data));
		InsertionSort(data);
		System.out.println("After Insertion Sort:" +  Arrays.toString(data));

	}

}
