package MergeSort;

import java.util.Arrays;
import java.util.Comparator;


/**
 * @File MergeSort.java
 * 
 * @author Ali Azhari

 */
public class MergeSort {
	
	public static <T> void  mergeSort(T[] S, Comparator<T> comp) {
		
		int n = S.length;
		if (n < 2) return; // array is trivially sorted
		
		int mid = n / 2;
		
		T[ ] S1 = Arrays.copyOfRange(S, 0, mid); // copy of first half
		T[ ] S2 =  Arrays.copyOfRange(S, mid, n); // copy of second half
		
		mergeSort(S1, comp);
		mergeSort(S2, comp);
		merge(S1, S2, S, comp); // merge sorted halves back into origina
		
	}

	private static <T> void merge(T[] s1, T[] s2, T[] s, Comparator<T> comp) {
		

		int i = 0;
		int j = 0;
		
		while (i + j < s.length) {
			if (j == s2.length || (i < s1.length && comp.compare(s1[i], s2[j]) < 0))
				s[i+j] = s1[i++]; // copy ith element of S1 and increment i
			else
				s[i+j] = s2[j++]; // copy jth element of S2 and increment j
		}
		
	}

	public static void main(String[] args) {
		

		String[] names = {"Sam", "Gingo", "Mohamed", "Ali", "Liz", "Frank", "Said", "Boush"};
		Integer[] names1 = {5,6,  2, 8, 4, 9, 1,  9, 3, 6};
		Comparator<Integer> comp = new DefaultComparator<Integer>();;
		mergeSort(names1, comp);
		System.out.println(Arrays.toString(names1));

	}



	
	

}
