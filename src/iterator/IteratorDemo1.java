package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo1 {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Get iterator
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext())
        {
        	iterator.next();
        	System.out.println(iterator.next());
        	break;
        }
		
	}

}
