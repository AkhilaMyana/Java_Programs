package wiproproject;

import java.util.*;

public class hashtreemap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm =new TreeMap<Integer,String>();
		tm.put(1,"India");
		tm.put(2,"South Africa");
		tm.put(3,"Australia");
		tm.put(4,"Englad");
		tm.put(5,"West Indies");
		System.out.println("the elements of treemap are");
		System.out.println(tm);
		String res=(String) tm.get(5);
		System.out.println(res);
		HashMap<Integer,String> hm =new HashMap<Integer,String>();
		hm.put(1,"India");
		hm.put(2,"South Africa");
		hm.put(3,"Australia");
		hm.put(4,"Englad");
		hm.put(5,"West Indies");
		hm.put(5, "Europe");
		System.out.println("the elements of hashmap are");
		System.out.println(hm);
		

	}

}
