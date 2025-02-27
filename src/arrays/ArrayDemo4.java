package arrays;

import objectandclass.Person;

public class ArrayDemo4 {

	public static void main(String[] args) {
		
		
		Object[] obj=new Object[5];
		
		for (int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
	
		}
		
		obj[0]="SSK";
		obj[1]=20.90;
		obj[2]=987654321L;
		obj[3]=new Person();
		
		((Person)obj[3]).name="Kumar";  //==>Type Casting
		((Person)obj[3]).age=80;
		((Person)obj[3]).ph=9090909090L;
		
		System.out.println("Printing New vlaues");
		
		for (int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);

	
		}
		
		
	}

}