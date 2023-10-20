package in.co.rays.collections;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterApi {
	public static void main(String[] args) {
		
	
	List<String>name=List.of("ram","rahul","roma","sharma","hariom","lavish");
	List<String>newname=name.stream().filter(i->i.startsWith("ra")).collect(Collectors.toList());
	System.out.println(newname);
	
	List<Integer>num=List.of(1,3,4,3,2,4,5,3,1,4,6,7,9,9,7,5,4,3,2);
	List<Integer>newnum=num.stream().distinct().collect(Collectors.toList());
	Collections.sort(newnum);
	System.out.println(newnum);
	
	List<Integer>num1=List.of(1,2,3,4,7,6,9,8,9);
	List<Integer>newnum1=num1.stream().map(i->i*i).collect(Collectors.toList());
	Collections.sort(newnum1);
	System.out.println(newnum1);

}
}