package in.co.rays.collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vvector {
	
public static void main(String[] args) {
	Vector v=new Vector();
     v.add(122);
     System.out.println(v);
v.add(675);
System.out.println(v);
Enumeration e=v.elements();
v.add("ok");
System.out.println(v);

while (e.hasMoreElements()) {
	Object object = (Object) e.nextElement();
	
}

}

}
