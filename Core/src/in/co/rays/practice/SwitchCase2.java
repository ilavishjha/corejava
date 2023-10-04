package in.co.rays.practice;

import java.util.Scanner;

public class SwitchCase2 {
	public static void main(String[] args) {
		float num1=210;
		float num2=790;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the operator");
		String symbol =  sc.next();
		//char symbol='+';
				float total;
		switch (symbol) {
		case "+" :
			total=num1+num2;
			System.out.println("add= "+total);
			
			break;
		case "-" :
			total=num1-num2;
			System.out.println("sub= "+total);
			
			break;
		case "*" :
			total=num1*num2;
			System.out.println("multiply= "+total);
			
			break;
		case "/" :
			total=num1/num2;
			System.out.println("divide= "+total);
			
			break;

		default:
			System.out.println("enter the valid symbol");
			break;
		}
	}

}
