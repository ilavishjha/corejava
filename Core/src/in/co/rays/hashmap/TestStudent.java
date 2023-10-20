
package in.co.rays.hashmap;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class TestStudent {
	public static void main(String[] args) {
		Student s1=new Student("lavish", 12, "indore");
		Student s2=new Student("ram", 1, "bhopal");
		Student s3=new Student("rahul", 2, "indore");
		
		Course c1=new Course(10, "java", 9876);
		Course c2=new Course(11, "java", 8765);
		Course c3=new Course(12,"html", 987);
		HashMap<Student, Course>hm=new HashMap<Student, Course>();
		hm.put(s1,c1);
		hm.put(s2, c2);
		hm.put(s3,c3);
		Set<Entry<Student, Course>>set=hm.entrySet();
		for (Entry<Student, Course> map : set) {
			Student st=map.getKey();
			Course co=map.getValue();
			if (co.cname.equals("java")) {
				System.out.println(co);
				
				
			}
		}
		
	}

}
