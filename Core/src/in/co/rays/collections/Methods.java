package in.co.rays.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Methods {

	public static void main(String[] args) {
//		add method
		Collection c = new ArrayList();
		c.add(13);
		c.add("lavish");
		c.add('y');
		System.out.println(c);
// 		addall
		Collection c1 = new ArrayList();
		c1.add(9);
		c1.add("ram");
		c1.add(12.4);
		System.out.println(c1);
		c1.addAll(c);
		System.out.println(c1);
//		c1.clear();
//		System.out.println(c1);
		System.out.println(c1.contains("lavish"));
		System.out.println(c1.containsAll(c));

		System.out.println(c1.size());

	}

}
