package in.co.rays.iostream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class ScannerPath {
	public static void main(String[] args) throws IOException {
		

	FileReader a=new FileReader("C:\\Users\\ADMIN\\Desktop\\iostream\\ok.txt");
	
	Scanner sc=new Scanner(a);
	
	while (sc.hasNext()) {
		System.out.println(sc.nextLine());
		
	}
	sc.close();
	
}

}
