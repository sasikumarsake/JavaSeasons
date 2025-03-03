package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		
		System.out.println("SSK".hashCode()%16);
		hs.add("SSK");
		System.out.println("SSK1".hashCode()%16);
		hs.add("SSK1");
		System.out.println("SSK2".hashCode()%16);
		hs.add("SSK2");
		System.out.println("SSK3".hashCode()%16);
		hs.add("SSK3");
		System.out.println("SSK4".hashCode()%16);
		hs.add("SSK4");
		
		for(String temp:hs)
		{
			System.out.println(temp);
		}
	}

}
