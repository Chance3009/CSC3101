package exercise_final1;

import java.util.Arrays;

public class TestOctagon {
	public static void main(String[] args) {
		Octagon[] arr = new Octagon[5];
		arr[0] = new Octagon(2);
		arr[1] = new Octagon(5.3);
		arr[2] = new Octagon(3);
		arr[3] = new Octagon(5);
		arr[4] = new Octagon(2);
		
		try {
			Octagon test = (Octagon)(arr[0].clone());
			System.out.println("Cloned object: " + test);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sorting the octagon ascendingly based on its side length...");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
