package in.co.rays.practice;

import java.util.Scanner;

public class SearchWord {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	String str="java programming";
	System.out.println("enter the character");
char s=sc.next().charAt(0);
int flage=0;
char ch[]=str.toCharArray();
for (int i = 0; i < ch.length; i++) {
	for (int j = 0; j < ch.length; j++) {
		if (s==ch[i]) {
			flage=1;
		}
	}
}
if (flage==1) {
	System.out.println("hai ji");
	
}else {
	System.out.println("nhi h ji");
}

}
}