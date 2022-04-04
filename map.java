package wiproproject;
import java.util.*;
import java.util.Map.Entry;
public class map {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm =new TreeMap<Integer,String>();
		tm.put(1,"Benny");
		tm.put(2,"mary");
		tm.put(3,"sasya");
		System.out.println(tm);
		System.out.println("the elements aof treemap are");
		for(Entry<Integer, String> m:tm.entrySet())
				{
			    System.out.println(m.getKey()+" "+m.getValue());
				}

	}

}
