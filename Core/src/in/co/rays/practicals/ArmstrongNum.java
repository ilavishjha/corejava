
package in.co.rays.practicals;

import java.util.Scanner;

public class ArmstrongNum {
//	public static void main(String[] args) {
//		int num=153;
//		int b=0;
//		int c;
//		int d=num;
//		while (d>0) {
//			c=d%10;
//			b=b+(c*c*c);//value equal to given num
//			d=d/10;
//			
//			
//		}
//		if (b==num) {
//			System.out.println("armstrong number");
//			
//		}else {
//			System.out.println("no");
//		}
//	}
//
//}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int b = 0;
		int c;
		int d = num;
		while (d > 0) {
			c = d % 10;
			b = b + (c * c * c);
			d = d / 10;

		}
		if (b == num) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("no");

		}
	}
}
