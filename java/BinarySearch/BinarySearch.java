package BinarySearch;

/**
 * @author Ali Azhari
 *
 */
public class BinarySearch {

	// the total running time is O(log n)

	public static boolean BS(int[] data, int target, int low, int high) {

		if (low > high)
			return false; // Not found
		else {

			int mid = (int) Math.floor((low + high) / 2);

			if (target == data[mid])
				return true;
			else {

				if (target > data[mid])
					return BS(data, target, mid + 1, high);
				else
					return BS(data, target, low, mid - 1);
			}
		}
	
	}

	public static void main(String[] args) {

		int data[] = { 1, 3, 5, 7, 9, 13 };

		for (int i = 0; i < 15; i++)
		System.out.println(i +" is " + (BS(data, i, 0, 5) == true ? "found" : "not found"));

	}

}
