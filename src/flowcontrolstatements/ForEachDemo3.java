package flowcontrolstatements;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo3 {
	public static void main(String[] args) {
		
		
		List<String> studentsList=new ArrayList<String>();
		studentsList.add("Topic1");
		studentsList.add("Topic2");
		studentsList.add("Topic3");
		studentsList.add("Topic4");
		studentsList.add("Topic5");
		studentsList.add("Topic6");
		
		//for each loop
		for(String temp:studentsList)
		{
			System.out.println(temp);
		}
	}

}
