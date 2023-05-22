package exercise4;

public class TwoMistakes {
	public static void main(String[] args) {
		int[] num = {4, 0, 0};
		
		try {
			num[2] = num[0] / num[1];
			num[2] = num[3] / num[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index.");
		} catch (ArithmeticException e) {
			System.out.println("Invalid arithmetic operation.");
		}
	}
}
