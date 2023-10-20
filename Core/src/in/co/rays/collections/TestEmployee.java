package in.co.rays.collections;

import java.util.ArrayList;
import java.util.Iterator;

//import com.sun.java.accessibility.util.internal.ListTranslator;

public class TestEmployee {
	public static void main(String[] args) {
		
	
	
	Employee e1=new Employee("lavish","indore",98);
	Employee  e2=new Employee("himanshu","bhopal",78);
	ArrayList list=new ArrayList();
	list.add(e1);
	list.add(e2);
	
	//set get
//	Employee e=(Employee) list.get(0);
//	System.out.println(e);
//	System.out.println(e.getId());
//	System.out.println(e.getAddress());
//	System.out.println(e.getName());
	//for loop
//for (int i = 0; i < list.size(); i++) {
//	Employee e=(Employee) list.get(i);
//	System.out.println(e);
	//}
	//ForEachLoop
//	for (Object object : list) {
//		Employee e=(Employee) object;
//		System.out.println(object);
	//}
	//Iterator use.
	Iterator it =list.iterator();
	while (it.hasNext()) {
		Employee e=(Employee) it.next();
		System.out.println(e);
	}
	
	
}
}