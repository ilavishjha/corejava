package in.co.rays.iostream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class StringPath {
	public static void main(String[] args) throws Exception {
		

	FileReader a=new FileReader("C:\\Users\\ADMIN\\Desktop\\iostream\\ok.txt");
	BufferedReader br=new BufferedReader(a);
	String line=br.readLine();
	while (line!=null) {
		System.out.println(line);
		line=br.readLine();
		
	}
	br.close();
	a.close();
	

}
}