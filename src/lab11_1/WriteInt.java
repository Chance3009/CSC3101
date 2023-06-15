// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 11

package lab11_1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class WriteInt {
	public static void main(String[] args) {
		int sum = 0;
		Random rd = new Random();
		// Create an output stream for integers.dat
		try (DataOutputStream out = new DataOutputStream(new FileOutputStream("integers.dat"))) {
			// Write 70-150 (inclusive) random integers randomly to the file 
			for (int i = 0; i < (rd.nextInt(150 - 70 + 1) + 70); i++) {
				int num = rd.nextInt();
				sum += num;
				out.writeInt(num);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Display the sum 
		System.out.println("Sum of random integers: " + sum);
	}
}