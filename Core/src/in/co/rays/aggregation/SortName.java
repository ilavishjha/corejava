package in.co.rays.aggregation;

import java.util.Comparator;

public class SortName implements Comparator<Student_Main> {

	@Override
	public int compare(Student_Main o1, Student_Main o2) {
		// TODO Auto-generated method stub
		return  o1.name.compareTo(o2.name);
	}

	 
	
	

}
//return 01.name.compareTo(02.name);