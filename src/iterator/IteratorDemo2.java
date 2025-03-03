package iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;

public class IteratorDemo2 {
	public static void main(String[] args) {

		Set<String> hs =new HashSet();

		hs.add("Sashikumar");
		hs.add("KumarSashi");
		hs.add("Sivaram");
		hs.add("SarithaSashi");
		hs.add("GangotriSashi");

		//using For each loop
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		
		
		//using Iterator COncept
		System.out.println("Using the iterator concept"+
		"\t");
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
//			it.next();
//			System.out.println(it.next());

			
			String s=it.next();
			System.out.println(s);
		}

	}

}
