package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] names = { "Molly", "Kieu", "Felicity", "Pargol", "Mari" };
		// 2. print the third element in the array
		System.out.println(names[2]);
		// 3. set the third element to a different value
		String d = "Dina";
		names[2] = d;
		// 4. print the third element again
		System.out.println(names[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		// 6. make an array of 50 integers
		int[] ages = new int[100];
		// 7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < 100; i++) {
			Random r = new Random();
			ages[i] = r.nextInt(100);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int smallestnumber = 100;
		for (int i = 0; i < ages.length; i++) {
			if (ages[i] < smallestnumber) {
				smallestnumber = ages[i];
			}
		}
		System.out.println(smallestnumber);
		// 9 print the entire array to see if step 8 was correct
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		// 10. print the largest number in the array.
		int greatest = 100;
		for (int i = 0; i < ages.length; i++) {
			if (ages[i] > greatest) {
				greatest = ages[i];
			}
		}
		System.out.println(greatest);
	}
}
