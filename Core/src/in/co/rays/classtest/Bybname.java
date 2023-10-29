package in.co.rays.classtest;

import java.util.Comparator;

public class Bybname implements Comparator<Library>{

	@Override
	public int compare(Library o1, Library o2) {
		
		return o1.bname.compareToIgnoreCase(o2.bname);
	}
	

}
