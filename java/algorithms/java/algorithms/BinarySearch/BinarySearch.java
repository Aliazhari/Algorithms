package java.algorithms.BinarySearch;

/**
 * @author Ali Azhari
 *
 */
public class BinarySearch {

	// the total running time is O(log n)

	public  boolean BS(int[] data, int target, int low, int high) {

		if (low > high)
			return false; // Not found

		int mid = (int) Math.floor((low + high) / 2);

		if (target == data[mid])
			return true;

		if (target > data[mid])
			return BS(data, target, mid + 1, high);
		else
			return BS(data, target, low, mid - 1);

	}



}
