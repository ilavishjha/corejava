package in.co.rays.practicals;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		Scanner sc=new Scanner (System.in);	
		System.out.println("enter the number");
		int num=sc.nextInt();
		while (a<=num) {
			b=a*b;
			a++;
			
			
		}
		System.out.println(b);
		
	
	}

}
