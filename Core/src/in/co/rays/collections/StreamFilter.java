package in.co.rays.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter{
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(100);
		list.add(101);
		list.add(102);
		list.add(50);
		list.add(56);
		list.add(76);
		System.out.println(list);
		
//		for (Integer i : list) {
//			if (i%2==0) {
//				System.out.println(i);
//				
//			}
			
		
		
//		List<Integer>newlist=new ArrayList<Integer>();////////long method
//		for (Integer i : list) {
//			if (i%2==0) {
//				newlist.add(i);
//		}
//			}
//		System.out.println(newlist);

	Stream<Integer> s=list.stream();
	//System.out.println(s);//hascode
	List<Integer>newlist=s.filter(e->e%2==0).collect(Collectors.toList());
	System.out.println(newlist);
				
		}
	
	}
		
		
		
	


