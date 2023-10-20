package in.co.rays.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class InputStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fi=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\iostream\\lavish.txt");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\iostream\\thar3.jpg");
		int ch=fi.read();
		while (ch!=-1) {
			fo.write(ch);
			
			ch=fi.read();
		}
		fi.close();
		fo.close();
		
	
			
		}
		
		

	}


