package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<String> listOfStudents = new ArrayList<String>();
		
		listOfStudents.add("Sasi");
		listOfStudents.add("Kumar");
		listOfStudents.add("SSKTunes");
		//listOfStudents.add(900000000L); //==> Type Safety After adding Generics.
		listOfStudents.add("SIVARAM");
		
		
		for (int i=0;i<listOfStudents.size();i++)
		{
			System.out.println(listOfStudents.get(i));
		}
		
		/*
		 * String[] studentNames = new String[5]; 
		 * studentNames[0]="SASIKUMAR";
		 * studentNames[1]="SAS"; 
		 * studentNames[2]="KUMAR"; 
		 * studentNames[3]="SAMAR";
		 * studentNames[4]=9090909090L; //==>Type Safety
		 */		
		
	}

}
