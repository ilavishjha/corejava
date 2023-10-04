package in.co.rays.practicals;

public class Palindrome {
	public static void main(String[] args) {
		
	
	int a=171;
	int b=a;
	int sum=0;
	int rem;
	while (b>0) {
		rem=b%10;
		sum=sum*10+rem;
		b=b/10;
		
		
		
		
	}
	if (a==sum) {
		System.out.println("yes");
		
	} else {
		System.out.println("no");

	}
	}

}
