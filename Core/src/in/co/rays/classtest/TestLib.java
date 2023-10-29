package in.co.rays.classtest;

import java.util.ArrayList;
import java.util.Collections;

public class TestLib {
	public static void main(String[] args) {
		
	
	ArrayList<Library>b=new ArrayList<Library>();
	b.add(new Library(10, "panchtantra"));
	b.add(new Library(9, "ramayana"));
	b.add(new Library(11,"mahabharata"));
	
	System.out.println(b);
	
	Collections.sort(b, new bybid());
	System.out.println(b);
	
	Collections.sort(b, new Bybname());
	System.out.println(b);
}
}