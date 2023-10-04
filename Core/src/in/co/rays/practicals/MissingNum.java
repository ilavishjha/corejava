package in.co.rays.practicals;

public class MissingNum {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		int[]b= {1,2,3,4};
		int sum=0;
		int sum1=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		for (int j = 0; j < b.length; j++) {
			sum1=sum1+b[j];
			
		}
		System.out.println(sum-sum1);
		}

}
