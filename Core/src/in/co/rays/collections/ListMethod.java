package in.co.rays.collections;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
	public static void main(String[] args) {
		
	
	List c=new ArrayList();
	//ArrayList i;
	c.add(44);
	c.add("lavish");
	c.add("lavish");
	System.out.println(c);
	List l=new ArrayList();
	l.add("ram");
	l.add(98);
	l.add('k');
	
	System.out.println(l);
	//i is index and o is object
//	c.add(1, 120);//at index  1 and value is 120
//	System.out.println(c);
//	c.get(0);
//	System.out.println(c.get(0));  //get is wriiten in sout itself
//	System.out.println(c.remove());
	c.remove(1);
	System.out.println(c);
	//System.out.println(c.remove(1)); //remove ke namm pe kuch bhi de rha index wala
//	System.out.println(c);
//	System.out.println(c.set(0, "lavish"));//change the 0 th index with the given object lavish
//	System.out.println(c);

System.out.println(c.indexOf("lavish"));  //give the index value of the taken value as in these case)(from the 
System.out.println(c.lastIndexOf("lavish")); //give the indexing from the last from the last
//l.subList(0,2);
c.addAll(0, l);
System.out.println(c);
System.out.println(c.subList(0,4));//give the index values object given




	}
}

