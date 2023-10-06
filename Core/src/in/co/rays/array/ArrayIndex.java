package in.co.rays.array;

import java.util.Scanner;

public class ArrayIndex {
	public static void main(String[] args) {

		// Scanner sc= new Scanner(System.in);
		// System.out.println("enter the size");
		int size = 2; // sc.nextInt();
		// System.out.println("enter the number");
		int[] number = new int[size];
		// for (int i = 0; i < number.length; i++) {
		// number[i] = 2; // sc.nextInt();
		number[0] = 1;
		number[1] = 2;
		// }
		System.out.println("index of");

		int x = 2; // sc.nextInt();
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
			if (number[i] == x) {
				System.out.println(i);// index value

			}

		}

	}
}
