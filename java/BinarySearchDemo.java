package java;

import java.algorithms.BinarySearch.BinarySearch;

public class BinarySearchDemo {

    public static void main(String[] args) {
    
    int data[] = { 1, 3, 5, 7, 9, 13 };
    BinarySearch bs = new BinarySearch();
		for (int i = 0; i < 15; i++)
			System.out.println(i + " is " + (bs.BS(data, i, 0, 5) == true ? "found" : "not found"));

	}
}
