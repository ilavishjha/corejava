package in.co.rays.aggregation;

import java.util.Comparator;

public class SortId implements Comparator<Student_Main>{

	@Override
	public int compare(Student_Main o1, Student_Main o2) {
		if (o1.id>o2.id) {
			return 1;
		}else if (o1.id<o2.id) {
			return -1;
		}
		return 0;
	}
	
	

}
