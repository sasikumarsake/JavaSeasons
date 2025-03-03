package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
	public static void main(String[] args) {
					
		List al=new ArrayList();
		
		System.out.println(al.size());
		
		al.add(1000);
		al.add("SSKTUNES");
		al.add('C');
		al.add(9876543219L);
		al.add(90909.0123456);
		al.add("SASIKUMAR");
		
		System.out.println(al.size());
		System.out.println(al);
		
		al.add(3,"OMOL");
		
		for (int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
	

}
