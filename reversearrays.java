import java.util.Scanner;

public class reversearrays {

	public static void main(String[] args) {
		int[] array = new int[8];

		// Prompt the user to enter eight integers //
		System.out.print("Please enter eight integers: ");

		// Fill the array //
		fill(array);

		// Display integers in REVERSE order //
		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i] + " ");
		System.out.println();
	}


	public static void fill(int[] array) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) 
			array[i] = input.nextInt();
	}
}