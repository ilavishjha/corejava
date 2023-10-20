package in.co.rays.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class E_Main {
	public static void main(String[] args) {
		Employee1 e=new Employee1(1, "lavish", 8609);
		Employee1  e1=new Employee1(6, "rahul", 984914);
		Employee1 e2=new Employee1(4, "raha",754595);
		ArrayList<Employee1>a1=new ArrayList<Employee1>();
		a1.add(e2);
		a1.add(e);
		a1.add(e1);
		Collections.sort(a1);
//		System.out.println(a1);
		Iterator<Employee1>it=a1.iterator();
		while (it.hasNext()) {
			Employee1 employee1 = (Employee1) it.next();
			System.out.println(employee1);
			}
		
		
	}

}
