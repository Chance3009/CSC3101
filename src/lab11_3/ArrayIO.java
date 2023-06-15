// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 11

package lab11_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Date;

public class ArrayIO {
    public static void main(String[] args) {
        // Create an output stream for file.dat
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.dat", true))) {
	        int[] arr = {9, 8, 7, 1, 2, 3};
	        // Write data to the file
	        out.writeObject(arr);
	        out.writeDouble(11.5);
	        out.writeObject(new Date());
	        out.writeUTF("Hello, world!");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error when writing to the file");
        }

        // Create an input stream for file.dat
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.dat"))) {
            // Read data from the file
            int[] readArr = (int[])(in.readObject());
            double d = in.readDouble();
            Date date = (Date)(in.readObject());
            String s = in.readUTF();
            
            // Display the content of the file
            System.out.println(Arrays.toString(readArr));
            System.out.println(d);
            System.out.println(date);
            System.out.println(s);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error when reading from the file");
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot perform class casting");
        }
    }
}
    
