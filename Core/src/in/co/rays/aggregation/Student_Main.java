package in.co.rays.aggregation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student_Main {
	int id;
String name;
	int  fee;
	
//	public Object name;
	public Student_Main(int id, String name, int fee) {
		
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student_Main [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	
	public static void main(String[] args) {
		ArrayList<Student_Main>a=new ArrayList<>();
		Student_Main s1=new Student_Main(101, "lavish", 5);
		Student_Main s2=new Student_Main(102, "arun", 10);
		Student_Main s3=new Student_Main(103, "prashant", 15);
		a.add(s1);
		a.add(s2);
		a.add(s3);
		System.out.println("sort by id");
				Collections.sort(a,new SortId());
				Iterator<Student_Main>it=a.iterator();
				while (it.hasNext()) {
					Student_Main so = it.next();
					System.out.println(so);
				}
					System.out.println("sort by name");
					Collections.sort(a,new SortName());
					Iterator<Student_Main>it1=a.iterator();
					while (it1.hasNext()) {
						Student_Main som = it1.next();
						System.out.println(som);
				
				
		
	}

}
	}