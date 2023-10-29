package in.co.rays.practicals;

public class CountConstantVowel {
	public static void main(String[] args) {
		
	
String str="India officially the Republic of ";

String str2=str.replace(" ", "");
char ch[]=str2.toCharArray();
int count =0;
int vcount=0;
for (int i = 0; i < ch.length; i++) {
	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
	count++;
	}
	else if (ch[i]>'a'||ch[i]<'z') {
		vcount++;
		
	}
	}
System.out.println(count);
System.out.println(vcount);
System.out.println(ch.length);
}
	}