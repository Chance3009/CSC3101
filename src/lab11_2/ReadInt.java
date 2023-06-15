// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 11

package lab11_2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadInt {
	public static void main(String[] args) {
		int sum = 0;
		// Create an input stream for integers.dat
		try (DataInputStream in = new DataInputStream(new FileInputStream("integers.dat"))) {
			// Read data from the file until reach the end of stream
			while(in.available() != 0) {
				sum += in.readInt();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Display the sum
		System.out.println("Sum of integers from the file: " + sum);
	} 
}
