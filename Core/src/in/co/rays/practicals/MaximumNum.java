package in.co.rays.practicals;

import java.util.Scanner;

public class MaximumNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		System.out.println("Enter the number");
		int num2=sc.nextInt();
		if (num1>num2) {
			System.out.println(" a is geater than b");
			
		} else {
			System.out.println("b is greater than a");

		}
	}

}
