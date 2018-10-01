package intro_to_array_lists;

import java.util.Random;

public class ArrayOfINT {
	public static void main(String[] args) {

		Random r = new Random();
		int s = 0;
		int i;
		int array[] = new int[50];
		for (int j = 0; j < array.length; j++) {
			i = r.nextInt(100);
			array[j] = i;
		}
		for (int m = 0; m < array.length; m++) {
			s = array[m] + s;
		}
		System.out.println("Your average is " + s / 50);
		System.out.println();
		System.out.println("Your total of all of the numbers is " + s);
	}
}
