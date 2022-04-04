package wiproproject;

import java.util.*;


public class collection {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		l.add(23);
		l.add("ramu");
		l.add(9.0);
		System.out.println("linked list elements are"+l);
		l.remove(0);
		System.out.println("linked list elements are"+l);
		Vector<String> v=new Vector<String>();
		v.add("Geetha");
		v.add("Ravi");
		v.add("sita");
		System.out.println("vector elements are "+v);
		v.remove(0);
		System.out.println("vector elements are "+v);
		PriorityQueue p=new PriorityQueue();
		p.add("jay");
		p.add("game");
		System.out.println("priority queue elements are "+p);
		p.remove();
		System.out.println("priority queue elements after deletion are "+p);
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(8);
		h.add(23);
		System.out.println("hash set elements are "+h);
		h.remove(23);
		System.out.println("hashset elements after deletion are "+h);
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		lh.add(9);
		lh.add(45);
		System.out.println("linkedhash set elements are "+lh);
		lh.remove(9);
		System.out.println("linkedhashset elements after deletion are "+lh);
		TreeSet t=new TreeSet();
		t.add("priya");
		t.add("laya");
		t.add("ramu");
		System.out.println("tree set elements are "+t);
		t.remove("laya");
		System.out.println("treeset elements after deletion are "+t);
		
		

	}

}
