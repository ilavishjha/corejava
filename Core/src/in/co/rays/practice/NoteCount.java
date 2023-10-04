package in.co.rays.practice;

import java.util.Scanner;

public class NoteCount {
	public static void main(String[] args) {
		int note[] = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount");
		int amount = sc.nextInt();
		// int amount = 1800;
		int count;
		for (int i = 0; i < note.length; i++) {
			count = amount / note[i];
			if (count > 0) {
				System.out.println(note[i] + "\t" + count);
			}
			amount = amount % note[i];
		}
	}
}
