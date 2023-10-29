package in.co.rays.classtest;

import java.util.Comparator;

public class bybid implements Comparator<Library> {

	@Override
	public int compare(Library o1, Library o2) {
		
		return o1.bookid-o2.bookid;
	}
	

}
