package in.co.rays.classtest;

import java.util.ArrayList;

public class TestItmethod {
	public static void main(String[] args) {
		Iteratormethod e1= new Iteratormethod(1, "lavish");
		Iteratormethod e2= new Iteratormethod(2, "ram");	
		
	ArrayList list=new ArrayList();
	list.add(e1);
	list.add(e2);
	
//	for (int i = 0; i < list.size(); i++) {
//		Iteratormethod e=(Iteratormethod) list.get(i);
//		System.out.println(e);
		
		for (Object object : list) {
			Iteratormethod e=(Iteratormethod) object;
			System.out.println(e);
		}
		
	}
	}


