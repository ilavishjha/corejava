package in.co.rays.iostream;

import java.io.File;
import java.io.FileWriter;

public class Writers {
	public static void main(String[] args) {
		File f=new File("java.txt");
		try {
			f.createNewFile();
		} catch (Exception e) {
			System.out.println("file not found");
			e.printStackTrace();
		}
		try {
			FileWriter fw=new FileWriter("java.txt");
			fw.write("hey Lavish this side who are you");
		fw.write("\n");
			fw.write("save water drink beer");
			fw.close();
		} catch (Exception e) {
			System.out.println("string error");
			e.printStackTrace();
		}
	}

}
