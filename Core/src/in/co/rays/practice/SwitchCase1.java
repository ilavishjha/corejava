package in.co.rays.practice;

import java.util.Scanner;

public class SwitchCase1 {
	public static void main(String[] args) {
//		int dayofweek=2;
//		switch (dayofweek) {
//		case 1:
//			System.out.println("monday");
//			
//			break;
//		case 2:
//			System.out.println("tuesday");
//			
//			break;
//			
//		case 3:
//			System.out.println("wednesday");
//			
//			break;
//		case 4:
//			System.out.println("thursday");
//			
//			break;
//		case 5:
//			System.out.println("friday");
//			
//			break;
//		case 6:
//			System.out.println("saturday");
//			
//			break;
//			
//			
//default:
//	System.out.println("input valid  number");
//			break;
//		}
//	}
//
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int dayofweek=sc.nextInt();
		switch (dayofweek) {
		case 1:
			System.out.println("monday");
			
			break;
		case 2:
			System.out.println("tuesday");
			
			break;
			
		case 3:
			System.out.println("wednesday");
			
			break;
		case 4:
			System.out.println("thursday");
			
			break;
		case 5:
			System.out.println("friday");
			
			break;
		case 6:
			System.out.println("saturday");
			
			break;
			
			
default:
	System.out.println("input valid  number");
			break;
		}
	}

		
}

