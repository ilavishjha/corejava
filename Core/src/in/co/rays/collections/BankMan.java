package in.co.rays.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.sun.source.util.Trees;



public class BankMan {
	public static void main(String[] args) {
		HashSet<Bankers> b = new HashSet<Bankers>();
		Bankers a = new Bankers(101, 987654321, "lavish", "ayodhya");
		Bankers c = new Bankers(1021, 98765432, "ram", "vrindvan");
		Bankers d = new Bankers(106, 9876543, "ram`1", "ujjain");
		Bankers e = new Bankers(109, 987654, "hariom", "dwarka");
		Bankers f = new Bankers(104, 98765, "sagar", "mathura");

		b.add(a);
		b.add(c);
		b.add(d);
		b.add(e);
		b.add(f);
		System.out.println(b);
		TreeSet<Bankers> tr = new TreeSet<>(b);
		//System.out.println(tr);
		Iterator<Bankers> it = tr.iterator();
		while (it.hasNext()) {
			Bankers ba =it.next();
			System.out.println(ba);
		}
			TreeSet<Bankers>tr1=new TreeSet<>(new SortName1());
			tr1.addAll(b);
			System.out.println("sort by name");
			Iterator<Bankers>it1=tr1.iterator();
			while (it1.hasNext()) {
				Bankers bankers = it1.next();
				System.out.println(bankers);
		}

	}

}
