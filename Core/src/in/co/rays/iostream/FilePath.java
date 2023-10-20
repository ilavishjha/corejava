package in.co.rays.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilePath {
	public static void main(String[] args) throws Exception {
		
	
	FileReader r=new FileReader("C:\\Users\\ADMIN\\Desktop\\iostream\\who.txt");
	int a=r.read();
	while (a!=-1) {
		System.out.println((char)a);
		a=r.read();
		
		
	}
r.close();
}
}