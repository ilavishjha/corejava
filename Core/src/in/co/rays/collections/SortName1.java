package in.co.rays.collections;

import java.util.Comparator;

public class SortName1 implements Comparator<Bankers>{


	@Override
	public int compare(Bankers o1, Bankers o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
