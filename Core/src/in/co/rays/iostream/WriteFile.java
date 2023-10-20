package in.co.rays.iostream;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) throws Exception {
		
	
	FileWriter fw=new FileWriter("C:\\Users\\ADMIN\\Desktop\\iostream\\hao.txt");
	fw.write("rahul bhaiya \r\n" + 
			"\r\n" + 
			"jhgfdsadfghjklhao\r\n" + 
			"\r\n" + 
			" ariya thodi der me\r\n" + 
			"ok done bye\r\n" + 
			"\r\n" + 
			"");
	fw.write("hao ariya thodi der me");
	fw.write("\n");
fw.write("ok done bye");
fw.close();
}
}