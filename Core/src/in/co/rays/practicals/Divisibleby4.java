package in.co.rays.practicals;

public class Divisibleby4 {
	public static void main(String[] args) {
		int a=4;
		int count=0;
		int sum=0;
		for (int i = 100; i <=200; i++) {
			if (i%4==0) {
				count=i;
				System.out.println(count);
				sum=sum+i;//needed only for sum of the number not for divisble by 4
				
				
			}
			
			
		}
		System.out.println(sum);
	}

}
