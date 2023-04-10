// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 5

package lab5_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MyList {
	// Sort the list in ascending order
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
	}
	
	// Sum the number in the list
	public static double sum(ArrayList<Double> list) {
		return list.stream().mapToDouble(Double::valueOf).sum();
	}
	
	// Remove duplicate object in the list
	public static void removeDuplicate(ArrayList<Integer> list) {
		Set<Integer> set = new HashSet<>(list);
		list.clear();
		list.addAll(set);
	}
}
