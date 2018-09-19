package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> bbt = new ArrayList<String>();
		//2. Add five Strings to your list
	bbt.add("Cubs");
	bbt.add("Padres");
	bbt.add("Angles");
	bbt.add("Pirates");
	bbt.add("Dodgers");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < bbt.size(); i++) {
			System.out.println(bbt.get(i));
		}
		//4. Print all the Strings using a for-each loop
		System.out.println();
		for(String s: bbt) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println();
		for (int i = 0; i < bbt.size(); i++) {
			if (i%2==0) {
				System.out.println(bbt.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		System.out.println();
			
		
		for (int i = bbt.size(); i > 0; i--) {
			System.out.println(bbt.get(i-1));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println();
		for (int i = 0; i < bbt.size(); i++) {
			if (bbt.get(i).contains("e")) {
				System.out.println(bbt.get(i));
			}
		}
	}
}
